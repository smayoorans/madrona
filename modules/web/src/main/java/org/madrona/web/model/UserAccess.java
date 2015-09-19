package org.madrona.web.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "user-access")
public class UserAccess {


    @Field
    private String username;

    @Field
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserAccess{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}