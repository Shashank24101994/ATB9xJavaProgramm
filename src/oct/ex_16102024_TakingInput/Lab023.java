package oct.ex_16102024_TakingInput;

public class Lab023
{
    public static void main(String[] args) {
        // Create a Program to check wheather Shesheh Trivedi will go to Goa OR NOT
        // Take a input age = Shesheh ->  Goa
        // age > 25 -> Drinking - Goa
        // Ternary operator
        int age = Integer.parseInt(args[0]);
        System.out.println(age>25 ? "allowed to goa":"not allowed to goa");
    }
}
