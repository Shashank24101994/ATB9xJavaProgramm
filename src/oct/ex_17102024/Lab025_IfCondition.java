package oct.ex_17102024;

import java.util.Scanner;

public class Lab025_IfCondition
{
    public static void main(String[] args) {
       // Allowed to vote or not
        // If age > 18 -> allowed to vote.

        Scanner sc =new Scanner(System.in);
        System.out.println("enter your age \n ");
        int age= sc.nextInt();
        if(age>18)
        {
            System.out.println("allowed to vote");
        }
        else {
            System.out.println("not allowed to vote");
        }
    }
}
