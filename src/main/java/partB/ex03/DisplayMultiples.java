package partB.ex03;

import java.util.Scanner;

public class DisplayMultiples {
    public static String displayWithMultiples() {
        String response = "";

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a value: ");

        int num = sc.nextInt();
        System.out.println("All of these numbers are a multiple of " + num);

        for (int i = 0; i <=50; i++){
            if (i % num == 0){
                System.out.println(i);

            }
        }
        sc.close();


        return response;
    }

    public static void main(String[] args) {
        String displayOutput = displayWithMultiples();
        System.out.print(displayOutput);
    }
}
