package DailyTask;

import java.util.Scanner;

public class Task3_180ct
{
    public static void main(String[] args) {
        //Write a program that converts between different units (e.g., kilometers to miles, Celsius to Fahrenheit) based on user selection using a switch statement.
        //Input. -
        //choice - 1 - km → m, km → 1km
        //choice - 2 - f → c, f → c
        Scanner sc = new Scanner(System.in);
        System.out.println("choice 1 = km to miles and choice 2 = f to c");

        int choice = sc.nextInt();
        switch (choice)
        {
            case 1:
                System.out.println("enter  the km ");
                double km =sc.nextDouble();
                double miles =(km *0.621371);
                System.out.println(miles);
                break;
            case 2:
                System.out.println("enter the fahrenheit");
                double fahernheit = sc.nextDouble();
                double celcius =((fahernheit-32)*5/9);
                System.out.println(celcius);
                break;
            default:
                System.out.println("invalid data");
                break;
        }
    }
}
