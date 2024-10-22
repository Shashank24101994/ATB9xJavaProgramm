package oct.ex_18102024;

import java.util.Scanner;

public class Lab032 {
    public static void main(String[] args) {
        // Switch Condition
        // User - Enter int number from 1 to 7
        // Which day it is it
        // 1 -> mon, 4 -> thur, 7 -> sun, 8,9,10....-1 -> Invalid
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day from (1 to 7");
        int day = sc.nextInt();
        switch (day)

        {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thrusday");
                break;
            case 5 :
                System.out.println("friday");
                break;
            case 6 :
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("no idea ! what day it is");
                break;
        }
        System.out.println("end of the loop");
        sc.close();

    }
}