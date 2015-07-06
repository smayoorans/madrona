
package org.madrona.trans_log.domain;


public class Message {

    private String message;
    private String msisdn;
    private String sessionId;
    private String encoding;
    private String transactionId;
    private boolean sendAsSms;
    private Context.MessageTransactionType transactionType;
    private String vlrAddress;


    public Message(String message) {
        this.message = message;
    }

    public Message(String message, String msisdn, String sessionId) {
        this.message = message;
        this.msisdn = msisdn;
        this.sessionId = sessionId;
    }

    public String getMessage() {
        return message;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public String getSessionId() {
        return sessionId;
    }

    public String getEncoding() {
        return encoding;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public Context.MessageTransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(Context.MessageTransactionType transactionType) {
        this.transactionType = transactionType;
    }

    public boolean isSendAsSms() {
        return sendAsSms;
    }

    public void setSendAsSms(boolean sendAsSms) {
        this.sendAsSms = sendAsSms;
    }


    public void setVlrAddress(String vlrAddress) {
        this.vlrAddress = vlrAddress;
    }

    public String getVlrAddress() {
        return vlrAddress;
    }

    @Override
    public String toString() {
        return "Message{" +
                "message='" + message + '\'' +
                ", msisdn='" + msisdn + '\'' +
                ", sessionId='" + sessionId + '\'' +
                ", encoding='" + encoding + '\'' +
                ", transactionId='" + transactionId + '\'' +
                ", sendAsSms=" + sendAsSms +
                ", transactionType=" + transactionType +
                ", vlrAddress='" + vlrAddress + '\'' +
                '}';
    }
}
