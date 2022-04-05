package com.kodilla.testing;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        if(calculator.add(5,4) == 9) {
            System.out.println("Test dodawania ok");
        } else {
            System.out.println("Błąd testu dodawania");
        }

        if(calculator.substract(5,3) == 2) {
            System.out.println("Test odejmowania ok");
        } else {
            System.out.println("Błąd testu odejmowania");
        }
    }
}
