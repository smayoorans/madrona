
package org.madrona.trans_log.domain;


public abstract class DeliveryResponse {

    private boolean isSuccess;
    private String statusCode;
    private String statusDescription;

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean isSuccess) {
        this.isSuccess = isSuccess;
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

    @Override
    public String toString() {
        return "MessageResponse{" +
                "isSuccess=" + isSuccess +
                ", statusCode='" + statusCode + '\'' +
                ", statusDescription='" + statusDescription + '\'' +
                '}';
    }
}
