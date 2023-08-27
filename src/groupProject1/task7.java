package groupProject1;

public class task7 {
    public static void main(String[] args) {

        // print the first 10 of the Fibonacci sequence
        // 0 1 1 2 3 5 8 13 21 34

        System.out.print("The first ten numbers of the Fibonacci sequence is ");

        int currNum = 0; // output first two numbers in the sequence
        int nextNum = 1;

        for (int i = 0; i < 10; ++i) {
            System.out.print(currNum + " " + nextNum + " ");

            currNum = currNum + nextNum;
            nextNum = currNum + nextNum;


        }
    }
}
