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

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (!login.equals(user.login)) return false;
        if (!firstName.equals(user.firstName)) return false;
        return surname.equals(user.surname);
    }

    @Override
    public int hashCode() {
        int result = login.hashCode();
        result = 31 * result + firstName.hashCode();
        result = 31 * result + surname.hashCode();
        return result;
    }
}
