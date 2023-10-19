package fun.pullock.dubbo.query;

import java.io.Serializable;

public class UserQuery implements Serializable {

    private static final long serialVersionUID = -6913251782089881011L;

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
