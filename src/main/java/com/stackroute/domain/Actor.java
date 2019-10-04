package com.stackroute.domain;

public class Actor {
    public String getName() {
        return name;
    }

    private String name;

    public void setName(String name) {
        this.name = name;
    }
    private String gender;
    public void setGender(String gender) {
        this.gender = gender;
    }
    private int age;
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
