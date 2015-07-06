
package org.madrona.trans_log.domain;


import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class SubscriberProfile {

    private String msisdn;
    private Date provisionedDate;
    private Date lastAccessTime;
    private String category;
    private String preferredLanguage;
    private String name;
    private String address;
    private String contactDetails;
    private String preferredActivities;
    private Map<String, String> dbInfo = new HashMap<>(15);

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public Date getProvisionedDate() {
        return provisionedDate;
    }

    public void setProvisionedDate(Date provisionedDate) {
        this.provisionedDate = provisionedDate;
    }

    public Date getLastAccessTime() {
        return lastAccessTime;
    }

    public void setLastAccessTime(Date lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPreferredLanguage() {
        return "en";
    }

    public void setPreferredLanguage(String preferredLanguage) {
        this.preferredLanguage = preferredLanguage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(String contactDetails) {
        this.contactDetails = contactDetails;
    }

    public String getPreferredActivities() {
        return preferredActivities;
    }

    public void setPreferredActivities(String preferredActivities) {
        this.preferredActivities = preferredActivities;
    }

    public void addDbInfoMap(String key, String value) {
        dbInfo.put(key, value);
    }



    @Override
    public String toString() {
        return "SubscriberProfile{" +
                "msisdn='" + msisdn + '\'' +
                ", provisionedDate='" + provisionedDate + '\'' +
                ", lastAccessTime='" + lastAccessTime + '\'' +
                ", category='" + category + '\'' +
                ", preferredLanguage='" + preferredLanguage + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", contactDetails='" + contactDetails + '\'' +
                ", preferredActivities='" + preferredActivities + '\'' +
                '}';
    }
}
