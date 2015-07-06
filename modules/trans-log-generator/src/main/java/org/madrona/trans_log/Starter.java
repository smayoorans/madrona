package org.madrona.trans_log;

import org.madrona.trans_log.domain.Context;
import org.madrona.trans_log.domain.MessageResponse;
import org.madrona.trans_log.domain.SmsResponse;
import org.madrona.trans_log.domain.SubscriberProfile;
import org.madrona.trans_log.util.MsisdnGenerator;
import org.madrona.trans_log.util.SessionIdGenerator;
import org.madrona.trans_log.util.TransactionIdGenerator;

import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Starter {

    private static MsisdnGenerator msisdnGenerator = new MsisdnGenerator();
    private static TransactionIdGenerator transactionIdGenerator = new TransactionIdGenerator();
    private static SessionIdGenerator sessionIdGenerator = new SessionIdGenerator();


    public static void main(String[] args) throws IOException {
        msisdnGenerator.init();
        ScheduledExecutorService executorService = new ScheduledThreadPoolExecutor(1);
        executorService.scheduleAtFixedRate(new ExecutionJob(), 0, 1, TimeUnit.MILLISECONDS);
    }

    private static class ExecutionJob implements Runnable {
        Random randomGenerator = new Random();
        @Override
        public void run() {
            Context context = new Context();
            context.setMsisdn(msisdnGenerator.get());
            context.setTransactionId(transactionIdGenerator.get().substring(4));
            context.setSessionId(sessionIdGenerator.get().substring(4));

            context.setMenuDescription("Menu1");
            context.setMenuClassification("C1");
            SubscriberProfile subscriberProfile = new SubscriberProfile();
            subscriberProfile.setCategory("cat1");

            context.setSubscriberProfile(subscriberProfile);

            context.setServiceCode("*123#");
            context.setTransactionType(Context.MessageTransactionType.CONT);

            MessageResponse messageResponse = new MessageResponse();
            messageResponse.setStatusCode("S1000");
            messageResponse.setStatusDescription("success");

            context.setUserMessageReceiveTime(convertToDate(LocalDateTime.now().minusSeconds(randomGenerator.nextInt())));
            context.setUserMessageSendTime(convertToDate(LocalDateTime.now()));


            context.setFinishSession(true);
            context.setSessionEndTime(new Date());
            context.setSessionStartTime(new Date());
            context.setMessageResponse(messageResponse);

            context.setServiceCode("S101");
            context.setStatusDescription("Success");

            SmsResponse smsResponse = new SmsResponse();
            smsResponse.setStatusCode("A12");
            smsResponse.setStatusDescription("Success");
            context.setSmsResponse(smsResponse);
            TransactionLogUtil.printTransLog(context);
        }
    }

    private static Date convertToDate(LocalDateTime ldt) {
        Instant instant = ldt.atZone(ZoneId.systemDefault()).toInstant();
        return Date.from(instant);
    }
}
