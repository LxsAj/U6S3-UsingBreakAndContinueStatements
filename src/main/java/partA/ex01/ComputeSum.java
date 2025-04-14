package partA.ex01;
import  java.util.Scanner;

public class ComputeSum {

    public static String computeSum() {
        String response = "";
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter Ten Integers, please: ");
        int num = sc.nextInt();
        while (num != 0){
            sum = sum + num;
            //System.out.println("Enter 0 to quite: ");
            num = sc.nextInt();
        }
        System.out.println("Sum is: " + sum);

        return response;
    }


    public static void main(String[] args) {
        String sum = computeSum();
        System.out.print(sum);
    }




    }

