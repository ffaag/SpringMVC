package com.it.mvc.pojo;

import org.springframework.stereotype.Component;

/**
 * @author ZuYingFang
 * @time 2021-08-10 9:05
 */

@Component
public class User {

    private Integer id;

    private String username;

    private Integer password;

    private String sex;

    private String email;

    public User(Integer id, String username, Integer password, String sex, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.sex = sex;
        this.email = email;
    }

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password=" + password +
                ", sex='" + sex + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
