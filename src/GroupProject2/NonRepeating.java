package GroupProject2;

import java.util.ArrayList;

public class NonRepeating {

    public void repeating(String inp) {
        ArrayList<Character> letters = new ArrayList<>();

        for (int i = 0; i < inp.length(); ++i) {
            letters.add(inp.charAt(i));
        }
        char currChar = letters.get(0);
        boolean nonRepeatChar = false;

        ifFound:
        for (int i = 0; i < letters.size(); ++i) {
            currChar = letters.get(i);
            letters.remove(i);

            if (letters.contains(currChar)) {
                nonRepeatChar = false;
                letters.add(i,currChar);
            }
            else {
                nonRepeatChar = true;
                break ifFound;
            }
        }

        if (nonRepeatChar) {
            System.out.println(currChar + " is the first non-repeating character in the string " + inp);
        }

        else {
            System.out.println("There exists no non-repeating characters in the string " + inp);
        }
    }

    public static void main(String[] args) {
        NonRepeating obj = new NonRepeating();

        obj.repeating("abracadabra");;

    }
}
