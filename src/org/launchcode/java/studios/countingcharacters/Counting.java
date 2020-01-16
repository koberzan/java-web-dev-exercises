package org.launchcode.java.studios.countingcharacters;

import java.nio.channels.Channel;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {
        String text = "If the product of two terms is zero then common sense says at least one of the " +
                "two terms has to be zero to start with. So if you move all the terms over to one side, you " +
                "can put the quadratics into a form that can be factored allowing that side of the equation " +
                "to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        for (int i = 0; i < 10; i++ ) {
            char[] charactersInString = text.toCharArray();
        }

        char[] charactersInString = text.toCharArray();

        //System.out.println(charactersInString);
        Map <String, Double> countedChars = new HashMap<>();

    }
}

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter some text to be counted or enter to use default text: ");

        }

    }

    private static Map<Character, Integer> countCharacters(String inputText) {
        char[] charactersInString = inputText.toCharArray();
        Map<Character, Integer> countedChars = new HashMap<>();

        for (char curChar : charactersInString) {
            if (Character.isLetter(curChar)) {
                if (countedChars.containsKey(curChar)) {
                    int curVal = countedChars.get(curChar);
                    countedChars.put(curChar, curVal++);
                } else {
                    countedChars.put(curChar, 1);
                }
            }
        }

        return countedChars;
    }

    /* Bonus mission: exclude non alphabetic chars
        he mentioned using a regular expression which looks for patterns
     */