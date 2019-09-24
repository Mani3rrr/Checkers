package com.kodilla.good.patterns.challenges;

public class User {

    private String name;
    private String nickName;
    private int number;

    public User(String name, String nickName, int number){

        this.name=name;
        this.nickName=nickName;
        this.number=number;
    }

    public String getName() {
        return name;
    }

    public String getNickName() {
        return nickName;
    }
    public int getNumber() {
        return number;
    }
}
