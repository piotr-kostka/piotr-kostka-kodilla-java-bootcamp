package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

    private final int userID;
    private final String nick;
    private final char sex;
    private final LocalDate birthDate;
    private final int postQuantity;

    public ForumUser(int userID, String nick, char sex, int year, int month, int day, int postQuantity) {
        this.userID = userID;
        this.nick = nick;
        this.sex = sex;
        this.birthDate = LocalDate.of(year, month, day);
        this.postQuantity = postQuantity;
    }

    public int getUserID() {
        return userID;
    }

    public String getNick() {
        return nick;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPostQuantity() {
        return postQuantity;
    }

    @Override
    public String toString() {
        return nick + ", sex: " + sex +
                ", birthday: " + birthDate +
                ", quantity of pots:" + postQuantity +
                ')';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ForumUser forumUser = (ForumUser) o;

        if (userID != forumUser.userID) return false;
        if (sex != forumUser.sex) return false;
        if (postQuantity != forumUser.postQuantity) return false;
        if (!nick.equals(forumUser.nick)) return false;
        return birthDate.equals(forumUser.birthDate);
    }

    @Override
    public int hashCode() {
        int result = userID;
        result = 31 * result + nick.hashCode();
        result = 31 * result + (int) sex;
        result = 31 * result + birthDate.hashCode();
        result = 31 * result + postQuantity;
        return result;
    }
}
