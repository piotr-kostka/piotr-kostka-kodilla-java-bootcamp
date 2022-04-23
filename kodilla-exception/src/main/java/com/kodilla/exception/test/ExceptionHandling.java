package com.kodilla.exception.test;

import java.time.LocalTime;

public class ExceptionHandling {

    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(1, 1.5);
        } catch (Exception e) {
            System.out.println("There is a problem! Error: " + e);
        } finally {
            System.out.println("Task done. Time: " + LocalTime.now());
        }
    }
}