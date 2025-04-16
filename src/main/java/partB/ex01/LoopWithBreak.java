package partB.ex01;

import java.util.Scanner;

public class LoopWithBreak {
    public static String loopWithBreak() {
        String response = "";
        Scanner sc = new Scanner(System.in);
        double sum = 0;

        System.out.println("Enter a number: ");
        double num = sc.nextDouble();

        while (num >= 0){
            sum += num;
            System.out.println("Enter a number: ");
            num = sc.nextDouble();
            if (num < 0){
                break;
            }
            //System.out.println("Sum = " + sum);
        }

        response += ("Sum = " + sum);
        return response;
    }

    public static void main(String[] args) {
        String loopOutput = loopWithBreak();
        System.out.print(loopOutput);
    }

}
