package DailyTask;

import java.util.Scanner;

public class Task2_18oct
{
    public static void main(String[] args) {
        //Write a program that takes an integer input (1-12) and prints the name of the corresponding month using a switch statement.
        //Input  - 12
        //Out - Dec.
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int month = sc.nextInt();
        switch (month)
        {
            case 1 :
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("Feb");
                break;
            case 3:
                System.out.println("march");
                break;
            case 4 :
                System.out.println("april");
                break;
            case 5:
                System.out.println("may");
                break;
            case 6:
                System.out.println("june");
                break;
            case 7:
                System.out.println("july");
            case 8:
                System.out.println("august");
                break;
            case 9:
                System.out.println("sept");
                break;
            case 10:
                System.out.println("oct");
                break;
            case 11:
                System.out.println("nov");
                break;
            case 12:
                System.out.println("dec");
                break;
            default:
                System.out.println("born in different planet");
                break;



        }
    }
}
