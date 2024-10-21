package DailyTask;

public class Task15oct
{
    public static void main(String[] args) {
// Using ternary operator to find the largest number
        int a =80 ,b=90 ,c=100;
     int result = (a>=b && a>=c)? a :(b>=c)?b:c;
        System.out.println(result);
        System.out.printf("the largest number is %d",result);

    }
}
