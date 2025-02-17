package com.example.annotation.customannotation.advancedlevel.customserializationannotation;
public class Main {

    public static void main(String[] args) throws IllegalAccessException {
        User user = new User("John", 25);

        String json = annotation.customannotation.advancedlevel.customserializationannotation.JsonSerializer.toJson(user);
        System.out.println(json);
    }
}
