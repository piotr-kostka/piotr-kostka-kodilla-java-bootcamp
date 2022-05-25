package com.kodilla.good.patterns.challenges.orders;

public class User {

    private String login;
    private String firstName;
    private String surname;

    public User(String login, String firstName, String surname) {
        this.login = login;
        this.firstName = firstName;
        this.surname = surname;
    }

    public String getLogin() {
        return login;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }
}
