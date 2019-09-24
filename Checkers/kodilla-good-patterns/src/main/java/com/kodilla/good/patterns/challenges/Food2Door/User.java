package com.kodilla.good.patterns.challenges.Food2Door;

public class User {
    private String name;
    private String surname;
    private String address;
    private String telephone;

    public User(String name, String surname, String address, String telephone) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.telephone = telephone;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    public String getTelephone() {
        return telephone;
    }

}
