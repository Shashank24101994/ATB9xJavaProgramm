package oct.ex_17102024;

import java.util.Scanner;

public class Lab029
{
    public static void main(String[] args) {
        // Create a Program - Take user input
        // Check weather the input is even or odd number

        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        if(num%2==0)
        {
            System.out.println("number is even number");
        }
        else {
            System.out.println("number is odd number");
        }

        // Modulus -> %
        //   10%2 == Even -> 0
        //   10%2 == Odd -> 1
        sc.close();
    }
}
