package groupProject1;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] dailyTemp = new double[7]; // 7 days is 1 week

        for (int i = 0; i < dailyTemp.length; i++) {
            System.out.println("Enter today's temperature");
            dailyTemp[i] = scanner.nextDouble();
        }
        double highTemp = dailyTemp[0];
        double lowTemp = dailyTemp[0];

        for (int i = 0; i < dailyTemp.length; ++i) {

            if(dailyTemp[i] > highTemp) {
                highTemp = dailyTemp[i];
            }

            else if (dailyTemp[i] < lowTemp) {
                lowTemp = dailyTemp[i];
            }
        }

        System.out.println("The lowest temperature of the week is " + lowTemp + " degrees Fahrenheit");
        System.out.println("The highest temperature of the week is " + highTemp + " degrees Fahrenheit");

    }
}
