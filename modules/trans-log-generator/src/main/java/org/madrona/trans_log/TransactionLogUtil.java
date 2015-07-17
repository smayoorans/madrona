package org.madrona.trans_log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.madrona.trans_log.domain.Context;

import java.text.SimpleDateFormat;


public class TransactionLogUtil {

    private static final Logger transLog = LogManager.getLogger("TRANS_LOG");
    private static final Logger logger = LogManager.getLogger(TransactionLogUtil.class);

    /*
             transaction_id
             session_id
             system_id
             app_id
             msisdn
             menu_classification
             menu_description
             category
             user_language

             ussd_transaction_type

             user_message_sent_time
             user_response_received_time
             user_response_duration

             session_start_date_time
             session_end_date_time
             session_duration

             service_code
             complete_path

             system_status_code
             system_status_description

             ussd_status_code
             ussd_status_description

             sms_status_code
             sms_status_description

     */

    public static void printTransLog(Context context) {
        StringBuilder trans = null;
        try {
            trans = processTransaction(context);
        } catch (Exception e) {
            logger.error("Error processing trans log : ", e);
        }

        transLog.info(trans);
//        System.out.println(trans);
    }

    private static StringBuilder processTransaction(Context context) {

        StringBuilder trans = new StringBuilder(500);
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

        trans.append('|')
                .append(context.getTransactionId()).append('|')
                .append(context.getSessionId()).append('|')
                .append("1").append('|')
                .append("1").append('|')
                .append(context.getMsisdn()).append('|');

        appendMenuDetails(context, trans);
        appendSubscriberDetails(context, trans);

        appendTransacionType(context, trans);

        appendUserResponseTime(context, trans, dateFormat);
        appendSessionTime(context, trans, dateFormat);

        appendServiceCodeDetails(context, trans);

        trans.append(context.getStatusCode()).append('|').append(context.getStatusDescription()).append('|');

        appendMessageResponseStatus(context, trans);
        appendSmsResponseStatus(context, trans);

        return trans;
    }

    private static void appendTransacionType(Context context, StringBuilder trans) {
        if (!context.isFinishUssdSession()) {
            trans.append(context.getTransactionType()).append('|');
        } else {
            trans.append("FIN").append('|');
        }
    }

    private static void appendMenuDetails(Context context, StringBuilder trans) {
        if (context.getMenuClassification() != null) {
            trans.append(context.getMenuClassification()).append('|');
        } else {
            trans.append('|');
        }
        if (context.getMenuDescription() != null) {
            trans.append(context.getMenuDescription()).append('|');
        } else {
            trans.append('|');
        }
    }

    private static void appendMessageResponseStatus(Context context, StringBuilder trans) {
        if (context.getMessageResponse() != null) {
            trans.append(context.getMessageResponse().getStatusCode()).append('|')
                    .append(context.getMessageResponse().getStatusDescription()).append('|');
        } else {
            trans.append('|').append('|');
        }
    }

    private static void appendSmsResponseStatus(Context context, StringBuilder trans) {
        if (context.getSmsResponse() != null) {
            trans.append(context.getSmsResponse().getStatusCode()).append('|')
                    .append(context.getSmsResponse().getStatusDescription()).append('|');
        } else {
            trans.append('|').append('|');
        }
    }

    private static void appendUserResponseTime(Context context, StringBuilder trans, SimpleDateFormat dateFormat) {
        if (context.getTransactionType() == Context.MessageTransactionType.CONT) {
            trans.append(dateFormat.format(context.getUserMessageSendTime())).append('|')
                    .append(dateFormat.format(context.getUserMessageReceiveTime())).append('|')
                    .append(context.getUserMessageSendTime().getTime() - context.getUserMessageReceiveTime().getTime()).append('|');
        } else {
            trans.append('|').append('|').append('|');
        }
    }

    private static void appendSubscriberDetails(Context context, StringBuilder trans) {
        if (context.getSubscriberProfile() != null) {
            trans.append(context.getSubscriberProfile().getCategory()).append('|')
                    .append(context.getSubscriberProfile().getPreferredLanguage()).append('|');
        } else {
            trans.append('|').append('|');
        }
    }

    private static void appendServiceCodeDetails(Context context, StringBuilder trans) {

        trans.append(context.getServiceCode()).append('|');

        if (context.isFinishUssdSession()) {
            StringBuilder userAccessPath = new StringBuilder("someString");
            if (context.isBookmark()) {
                int pathStart = userAccessPath.indexOf(context.getServiceCode()) + 1;
                trans.append(userAccessPath.substring(pathStart, userAccessPath.length())).append('|');
            } else {
                trans.append(userAccessPath.length() > 0 ? userAccessPath.deleteCharAt(userAccessPath.length() - 1) : "").append('|');
            }
        }
    }

    private static void appendSessionTime(Context context, StringBuilder trans, SimpleDateFormat dateFormat) {
        if (context.isFinishUssdSession()) {
            trans.append(dateFormat.format(context.getSessionStartTime())).append('|')
                    .append(dateFormat.format(context.getSessionEndTime())).append('|')
                    .append(context.getSessionEndTime().getTime() - context.getSessionStartTime().getTime()).append('|');
        } else {
            trans.append('|').append('|').append('|');
        }
    }
}
