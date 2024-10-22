package DailyTask;

import java.util.Scanner;

public class Task2_17oct
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first side\n");
        int side1= sc.nextInt();
        System.out.println("enter second side\n");
        int side2= sc.nextInt();
        System.out.println("enter third side\n");
        int side3= sc.nextInt();
        if(side1<=0 ||side2<=0 ||side3<=0)
        {
            System.out.println("enter right side data");
        } else if ((side1==side2&&side2==side3 &&side3==side1))
        {
            System.out.println("triangle is eqilateral");
        } else if (side1==side2||side2==side3||side3==side1)
        {
           System.out.println("traingle is isosceles");
        }
        else {
            System.out.println("traingle is scalene");
        }
    }
}
