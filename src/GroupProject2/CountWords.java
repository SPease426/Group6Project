package GroupProject2;

public class CountWords {

    public int numWords(String inp) {
        inp = inp.replaceAll("[.,]", "");
        String[] words = inp.split("\\s+");

        return words.length;

    }

    public static void main(String[] args) {

        CountWords obj = new CountWords();

        System.out.println("There are " + obj.numWords("Hello,     World.") + " words");
    }
}
