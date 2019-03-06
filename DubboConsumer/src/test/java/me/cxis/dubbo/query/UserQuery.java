package me.cxis.dubbo.query;

import java.io.Serializable;

public class UserQuery implements Serializable {

    private Long id;

    private String userName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "UserQuery{" +
            "id=" + id +
            ", userName='" + userName + '\'' +
            '}';
    }
}
