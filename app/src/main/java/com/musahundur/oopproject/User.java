package com.musahundur.oopproject;

public class User {
    //Property
    String name;
    String job;

    //Constructor
    public User(String nameInput, String jobInput) {
        this.name = nameInput;
        this.job = jobInput;
        System.out.println("User Created..");
    }
}
