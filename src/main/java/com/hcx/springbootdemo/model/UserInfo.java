package com.hcx.springbootdemo.model;

public class UserInfo {

    private String Name;

    private String age;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "Name='" + Name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
