package oct.ex_16102024_TakingInput;

import java.util.Scanner;

public class Lab024_ScannerClass
{
    public static void main(String[] args) {
        //scanner class
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the age \n");
        int age = sc.nextInt();// stored the value
        System.out.println(age>25 ? "allowed to goa":"not allowed to goa");
        sc.close();
    }
}
