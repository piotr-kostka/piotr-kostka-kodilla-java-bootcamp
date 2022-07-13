package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.kodilla.sudoku.UserChoice.*;

public class UserService {
    private final static Scanner scanner = new Scanner(System.in);

    public static List<String> inputFirstValue() {
        List<String> inputList = new ArrayList<>();
        System.out.println("WELCOME TO SUDOKU SOLVER");
        System.out.println("Please insert value in 'xyz' format, for example: 123" + "\nInfo: " +
                "\n1 - Row, 2 - Column, 3 - Value");
        inputList.add(checkNumber(scanner.nextLine()));
        return inputNextValue(inputList);
    }
    public static List<String> inputNextValue(List<String> inputList) {
        System.out.println("Please insert next value in 'xyz' format, for example: 123" +
                "\nIf not press 'N' to go to the next step");
        String input = scanner.nextLine().toUpperCase();
        while (!input.equals("N")) {
            inputList.add(checkNumber(input));
            System.out.println("Please insert Your next input in format 'xyz', for example: 123" +
                    "\nIf not press 'N' to go to the next step");
            input = scanner.nextLine().toUpperCase();
        }
        return inputList;
    }
    public static String checkNumber(String text) {
        while (!text.matches("[1-9]{3}")) {
            System.out.println("Wrong input - only numbers from 1 to 9");
            text = scanner.nextLine();
        }
        return text;
    }

    public static UserChoice setMove() {
        System.out.println("What do you want to do? Write: SUDOKU - to solve game, N - to restart application, X - to close application");
        String userChoose;
        while(true) {
            userChoose = scanner.nextLine().toUpperCase();
            switch (userChoose) {
                case "SUDOKU":
                    return SUDOKU;
                case "X":
                    return END_GAME;
                case "N":
                    return NEW_GAME;
                default:
                    System.out.println(userChoose + " is WRONG choice! Please choose again");
                    break;
            }
        }
    }
}