package DailyTask;

public class Task2_16oct
{
    public static void main(String[] args) {
        //Take a user input 2 numbers from the arguments and calculate the maximum in between with ternary operator.
      int a = Integer.parseInt(args[0]);
      int b = Integer.parseInt(args[1]);
        System.out.printf("the two number are %d %d\n" ,a,b);
        int largestnumber = a>b ?a:b;
        System.out.printf("the largest number between %d and %d is %d ",a,b,largestnumber);

    }
}
