package GroupProject2;

public class ReverseString {

    public String reverseStr(String inp) {
        String reversedStr = "";

        for(int i = inp.length() - 1; i >= 0; --i) {
            reversedStr = reversedStr + inp.charAt(i);
        }

        return reversedStr;
    }

    public static void main(String[] args) {
        ReverseString word = new ReverseString();

        System.out.println(word.reverseStr("hello"));
    }
}
