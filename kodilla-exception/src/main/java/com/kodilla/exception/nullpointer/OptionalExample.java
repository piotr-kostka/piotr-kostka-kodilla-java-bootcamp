package com.kodilla.exception.nullpointer;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {
        User user = new User("Andrzej");

        Optional<User> optionalUser = Optional.ofNullable(user);

        String username = optionalUser.orElse(new User("Andrzej")).getUsername();
        System.out.println(username);

        optionalUser.ifPresent(user1 -> System.out.println(user1.getUsername()));
    }
}
