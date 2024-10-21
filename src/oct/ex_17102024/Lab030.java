package oct.ex_17102024;

import java.util.Scanner;

public class Lab030
{
    public static void main(String[] args) {
        // Condition - 2 outputs ,
        // Can we have two or more outputs?
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num 1");
        int num1= sc.nextInt();
        System.out.println("enter num2");
        int num2= sc.nextInt();
        if(num1>num2)
        {
            System.out.println("num1 is greater than num2");
        } else if (num2>num1)
        {
            System.out.println("num2 is greater than num1");
        }
        else
        {
            System.out.println("both are equal");
        }
    }
}
