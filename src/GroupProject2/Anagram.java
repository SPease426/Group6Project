package GroupProject2;

import java.util.ArrayList;

public class Anagram {

    public void isAnagram(String inp1, String inp2){ // String inp1 will be the bigger string of the two
        ArrayList<Character> chars = new ArrayList<>();

        inp1 = inp1.toLowerCase(); // Anagrams are not case sensitive so all lowercase
        inp2 = inp2.toLowerCase();

        for(int i = 0; i < inp1.length(); ++i) {
            chars.add(inp1.charAt(i));
        }

        System.out.println(chars);

        String str = "";

        for(int i = 0; i < inp2.length(); ++i) {

            for (int j = 0; j < chars.size(); ++j) {
                if (inp2.charAt(i) == chars.get(j)) {
                    str = str + chars.get(j);
                    chars.remove(j);
                }

            }

        }
        if (str.equalsIgnoreCase(inp2) && inp1.length() == inp2.length()) {
            System.out.println("The string " + inp2 + " is an anagram of " + inp1);
        }
        else {
            System.out.println("The string " + inp2 + " is not an anagram of " + inp1);
        }
    }

    public static void main(String[] args) {

        Anagram obj = new Anagram();

        obj.isAnagram("SpiderMan", "ride");

    }
}
