package GroupProject2;

public class Palindrome {

    public void isPalindrome(String inp) {
        inp = inp.toLowerCase();
        String word = "";

        for (int i = inp.length() - 1; i >= 0; --i) {
            word = word + inp.charAt(i);
        }

        if (inp.equals(word)) {
            System.out.println(inp + " is a palindrome");
        }

        else {
            System.out.println(inp + " is not a palindrome");
        }

    }

    public static void main(String[] args) {
        Palindrome obj = new Palindrome();

        obj.isPalindrome("Sam");
    }
}
