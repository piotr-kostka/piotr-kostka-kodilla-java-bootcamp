package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public void beautify(String text, PoemDecorator poemDecorator) {
        String result = poemDecorator.decorate(text);
        System.out.println("String beautifier: " + result);
    }

    public static String getUpperCase(String text) {
        return text.toUpperCase();
    }

    public static String getLowerCase(String text) {
        return text.toLowerCase();
    }

    public static String addABC(String text) {
        return "ABC " + text + " ABC";
    }

    public static String addMarks(String text) {
        return ">>>" + text + "<<<";
    }

    public static String addExclamation(String text) {
        return text + "!!!";
    }

}
