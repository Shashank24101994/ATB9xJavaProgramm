package DailyTask;

import java.util.Scanner;

public class Task1_180ct
{
    public static void main(String[] args) {
        //Create a simple calculator that performs addition, subtraction, multiplication, and division, modus based on user input using switch statements.

        //Inputs :   num 1, num 2, +
        //Output :  num1+num2 → print information.
        System.out.println(" 1 - Add 2 - Subtraction 3 - Multiply  4 - Divide 5 - Modulus");
        Scanner sc =new Scanner(System.in);
        System.out.println("enter num1");
        int num1 = sc.nextInt();
        System.out.println("enter num2");
        int num2= sc.nextInt();
        System.out.println("enter operator");
          int operator = sc.nextInt();
         switch (operator)
         {
             case 1 :
                 System.out.println(num1+num2);
                 break;
             case 2:
                 System.out.println(num1-num2);
                 break;
             case 3 :
                 System.out.println(num1 *num2);
                 break;
             case 4 :
                 System.out.println(num1/num2);
                 break;
             case 5:
                 System.out.println(num1%num2);
                 break;
             default:
                 System.out.println("wrong number");
                 break;

         }

    }
}
