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
import java.util.*;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Starter {

    private static MsisdnGenerator msisdnGenerator = new MsisdnGenerator();
    private static TransactionIdGenerator transactionIdGenerator = new TransactionIdGenerator();
    private static SessionIdGenerator sessionIdGenerator = new SessionIdGenerator();
    private static List<String> menuClassifications = new ArrayList<>();
    private static List<String> menuDescriptions = new ArrayList<>();
    private static List<String> menuCategories = new ArrayList<>();
    private static List<String> serviceCodeList = new ArrayList<>();

    private static Random random = new Random();

    public static void main(String[] args) throws IOException {

        menuClassifications.add("Class1");
        menuClassifications.add("Class2");
        menuClassifications.add("Class3");

        menuDescriptions.add("Menu1");
        menuDescriptions.add("Menu2");
        menuDescriptions.add("Menu3");
        menuDescriptions.add("Menu4");

        menuCategories.add("cat1");
        menuCategories.add("cat2");
        menuCategories.add("cat3");
        menuCategories.add("cat4");

        serviceCodeList.add("*123#");
        serviceCodeList.add("*124#");
        serviceCodeList.add("*125#");

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

            context.setMenuDescription(getRandomList(menuDescriptions));
            context.setMenuClassification(getRandomList(menuClassifications));
            SubscriberProfile subscriberProfile = new SubscriberProfile();
            subscriberProfile.setCategory(getRandomList(menuCategories));

            context.setSubscriberProfile(subscriberProfile);

            context.setServiceCode(getRandomList(serviceCodeList));
            context.setTransactionType(Context.MessageTransactionType.CONT);

            MessageResponse messageResponse = new MessageResponse();
            messageResponse.setStatusCode("S1000");
            messageResponse.setStatusDescription("success");

            context.setUserMessageReceiveTime(convertToDate(LocalDateTime.now().minusSeconds(randomGenerator.nextInt())));
            context.setUserMessageSendTime(convertToDate(LocalDateTime.now()));


            context.setFinishSession(true);
            context.setSessionEndTime(convertToDate(LocalDateTime.now().minusSeconds(randomGenerator.nextInt())));
            context.setSessionStartTime(convertToDate(LocalDateTime.now()));
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

    public static String getRandomList(List<String> list) {
        int index = random.nextInt(list.size());
        return list.get(index);

    }
}
