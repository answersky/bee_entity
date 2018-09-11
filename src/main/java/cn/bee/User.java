package cn.bee;

import java.io.Serializable;

/**
 * @author answer
 * 2018/2/5
 */
public class User implements Serializable {
    private static final long serialVersionUID = -7246691510818047305L;
    private Integer id;
    private String name;
    private String realName;
    /**
     * 密码统一用md5码加密处理
     */
    private String password;
    private String uuid;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", realName='" + realName + '\'' +
                ", password='" + password + '\'' +
                ", uuid=" + uuid +
                '}';
    }
}
