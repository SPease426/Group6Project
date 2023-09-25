package GroupProject2;

import java.util.ArrayList;
import java.util.Scanner;

public class wordsUsingA {

    public void wordList() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();

        System.out.println("How many words do you wish to add to the list");
        int numWords = scanner.nextInt();

        for (int i = 0; i < numWords; ++i) {
            System.out.println("Enter a word");
            String userWord = scanner.next();
            words.add(userWord);
        }

        System.out.println(words);

        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);

            if (word.startsWith("A")) {
                word = word.replace("A", "a");
                words.remove(i);
                words.add(i, word); // remove and edited and added back after editing
            }
            else {
                words.remove(i); // didn't start with Capital letter A
                --i;
            }

        }
        if (words.size() == 0) {
            System.out.println("There are no words currently listed that started with a capital A");
        }
        else {
            System.out.println("The words that began with the character A are");
            for(int i = 0; i < words.size(); ++i) {
                System.out.println(words.get(i));
            }
        }
    }

    public static void main(String[] args) {
        wordsUsingA obj = new wordsUsingA();

        obj.wordList();



    }
}
