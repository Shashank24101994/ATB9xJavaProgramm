package oct.ex_17102024;

import java.util.Scanner;

public class Lab031_hackerrankquestion
{
    public static void main(String[] args) {
        // ✅ Grade Calculator:
        // Write a program that calculates and displays the letter grade
        // for a given numerical score (e.g., A, B, C, D, or F)
        // based on the following grading scale:
        //
        //A: 90-100
        //B: 80-89
        //C: 70-79
        //D: 60-69
        //F: 0-59
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR NUMBER");
        int num = sc.nextInt();
        if(num>=90 && num<=100)
        {
            System.out.println('A');
        }
        else if (num>=80&&num<=89)
        {
            System.out.println('B');
        }
        else if (num>=70&&num<=79)
        {
            System.out.println('C');
        }
        else if (num>=60&&num<=69)
        {
            System.out.println('D');

        }
        else if (num<=0 || num>=100)
        {
            System.out.println("please enter right data");
        }
        else
        {
            System.out.println("Grade F");
        }

        }

    }

