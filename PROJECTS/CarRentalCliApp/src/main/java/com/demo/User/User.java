package com.demo.User;

import java.util.UUID;

public class User {
    private UUID id;
    private String firt_name;
    private String last_name;
    private int age;
    private String phone_num;

    public User(UUID id, String firt_name, String last_name, int age, String phone_num) {
        this.id = id;
        this.firt_name = firt_name;
        this.last_name = last_name;
        this.age = age;
        this.phone_num = phone_num;
    }

    public UUID getId() {
        return id;
    }

    public void setId(String id) {
        this.id = UUID.fromString(id);
    }

    public String getFirt_name() {
        return firt_name;
    }

    public void setFirt_name(String firt_name) {
        this.firt_name = firt_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone_num() {
        return phone_num;
    }

    public void setPhone_num(String phone_num) {
        this.phone_num = phone_num;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firt_name='" + firt_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", age=" + age +
                ", phone_num='" + phone_num + '\'' +
                '}';
    }
}
