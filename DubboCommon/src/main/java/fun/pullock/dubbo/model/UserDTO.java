package fun.pullock.dubbo.model;

import java.io.Serializable;

/**
 * 必须实现序列化，如果去掉，就会出错
 */
public class UserDTO implements Serializable {

    private int id;

    private String userName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
        return "UserDTO{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                '}';
    }
}
