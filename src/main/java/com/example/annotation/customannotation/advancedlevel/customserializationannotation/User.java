package com.example.annotation.customannotation.advancedlevel.customserializationannotation;
public class User {

    @annotation.customannotation.advancedlevel.customserializationannotation.JsonField(name = "user_name")
    private String name;

    @annotation.customannotation.advancedlevel.customserializationannotation.JsonField(name = "user_age")
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
