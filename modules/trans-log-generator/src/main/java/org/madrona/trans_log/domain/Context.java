package org.madrona.trans_log.domain;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class Context {

    public enum MessageTransactionType {
        INIT, CONT;
    }

    private String transactionId;
    private String sessionId;
    private String msisdn;

    private String menuClassification;
    private String menuDescription;

    private SubscriberProfile subscriberProfile;
    private boolean finishUssdSession;

    private String serviceCode;
    private Message receivedMessage;
    private Message sendMessage;
    private MessageTransactionType transactionType;
    private final Map<String, Object> info;
    private boolean continueFilter;
    private boolean bookmark;
    private MessageResponse messageResponse;

    private SmsResponse smsResponse;
    private Date sessionStartTime;

    private Date sessionEndTime;
    private Date userMessageSendTime;

    private Date userMessageReceiveTime;
    private String statusCode;
    private String statusDescription;
    private boolean allowedForSurvey;

    public Context() {
        info = new HashMap<>();
        transactionType = MessageTransactionType.INIT;
        continueFilter = true;
    }

    public void setFinishSession(boolean finishUssdSession) {
        this.finishUssdSession = finishUssdSession;
    }

    public boolean isFinishUssdSession() {
        return finishUssdSession;
    }

    public String getMenuDescription() {
        return menuDescription;
    }

    public void setMenuDescription(String menuDescription) {
        this.menuDescription = menuDescription;
    }


    public Message getSendMessage() {
        return sendMessage;
    }

    public void setSendMessage(Message sendMessage) {
        this.sendMessage = sendMessage;
    }

    public Message getReceivedMessage() {
        return receivedMessage;
    }

    public void setReceivedMessage(Message receivedMessage) {
        this.receivedMessage = receivedMessage;
    }

    /**
     * Store a value to the session so that it can be retrieved on the next transaction
     *
     * @param key
     * @param value
     */
    public void addValue(String key, Object value) {
        info.put(key, value);
    }

    /**
     * Retrieve a value which has been previously stored in another transaction using method addValue
     *
     * @param key
     * @return
     */
    public Object retrieveValue(String key) {
        return info.get(key);
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public MessageTransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(MessageTransactionType transactionType) {
        this.transactionType = transactionType;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public boolean isContinueFilter() {
        return continueFilter;
    }

    public void setContinueFilter(boolean continueFilter) {
        this.continueFilter = continueFilter;
    }

    public SubscriberProfile getSubscriberProfile() {
        return subscriberProfile;
    }

    public void setSubscriberProfile(SubscriberProfile subscriberProfile) {
        this.subscriberProfile = subscriberProfile;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionStartTime(Date sessionStartTime) {
        this.sessionStartTime = sessionStartTime;
    }

    public Date getSessionStartTime() {
        return sessionStartTime;
    }

    public void setSessionEndTime(Date sessionEndTime) {
        this.sessionEndTime = sessionEndTime;
    }

    public Date getSessionEndTime() {
        return sessionEndTime;
    }

    public void setUserMessageSendTime(Date userMessageSendTime) {
        this.userMessageSendTime = userMessageSendTime;
    }

    public Date getUserMessageSendTime() {
        return userMessageSendTime;
    }

    public void setUserMessageReceiveTime(Date userMessageReceiveTime) {
        this.userMessageReceiveTime = userMessageReceiveTime;
    }

    public Date getUserMessageReceiveTime() {
        return userMessageReceiveTime;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public boolean isBookmark() {
        return bookmark;
    }

    public void setBookmark(boolean bookmark) {
        this.bookmark = bookmark;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusDescription() {
        return statusDescription;
    }

    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }

    public void setMessageResponse(MessageResponse messageResponse) {
        this.messageResponse = messageResponse;
    }

    public MessageResponse getMessageResponse() {
        return messageResponse;
    }

    public SmsResponse getSmsResponse() {
        return smsResponse;
    }

    public void setSmsResponse(SmsResponse smsResponse) {
        this.smsResponse = smsResponse;
    }

    public String getMenuClassification() {
        return menuClassification;
    }

    public void setMenuClassification(String menuClassification) {
        this.menuClassification = menuClassification;
    }

    public boolean isAllowedForSurvey() {
        return allowedForSurvey;
    }

    public void setAllowedForSurvey(boolean allowedForSurvey) {
        this.allowedForSurvey = allowedForSurvey;
    }


    @Override
    public String toString() {
        return "Context{" +
                "msisdn='" + msisdn + '\'' +
                ", serviceCode='" + serviceCode + '\'' +
                ", userMenuSession=" + "userMenuSession" +
                ", subscriberProfile=" + subscriberProfile +
                ", receivedMessage=" + receivedMessage +
                ", sendMessage=" + sendMessage +
                ", transactionType=" + transactionType +
                ", info=" + info +
                ", transactionId='" + transactionId + '\'' +
                ", continueFilter=" + continueFilter +
                ", bookmark=" + bookmark +
                ", sessionId='" + sessionId + '\'' +
                ", messageResponse=" + messageResponse +
                ", smsResponse=" + smsResponse +
                ", menuClassification='" + menuClassification + '\'' +
                ", sessionStartTime=" + sessionStartTime +
                ", menuDescription='" + menuDescription + '\'' +
                ", sessionEndTime=" + sessionEndTime +
                ", userMessageSendTime=" + userMessageSendTime +
                ", userMessageReceiveTime=" + userMessageReceiveTime +
                ", statusCode='" + statusCode + '\'' +
                ", statusDescription='" + statusDescription + '\'' +
                ", allowedForSurvey=" + allowedForSurvey +
                ", finishUssdSession=" + finishUssdSession +
                '}';
    }
}
