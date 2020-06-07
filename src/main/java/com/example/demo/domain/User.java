package com.example.demo.domain;

/**
 * @ClassName User
 * @Description TODO
 * @Author lizhitao
 * @Data 2020/6/6 23:24
 * @Version 1.0
 **/
public class User {

    private String id;

    private String username ;

    private String password;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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
        return "User{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
