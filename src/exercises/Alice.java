package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of " +
                "having nothing to do: once or twice she had peeped into the book her sister was reading, but it " +
                "had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without " +
                "pictures or conversation?'";

        Scanner input = new Scanner(System.in);
        System.out.println("Enter word to search for:");
        String term = input.nextLine().toLowerCase();
        //use space as a deliminator on the sentence and push each word to an array. Then use for loop
        //to search for the word

        if (sentence.contains(term) == true) {
            System.out.println("Word was found");
        } else {
            System.out.println("Word was not found");
        }

        System.out.println(sentence.contains("term"));

    }
}