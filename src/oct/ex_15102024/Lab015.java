package oct.ex_15102024;

public class Lab015
{
    public static void main(String[] args) {
        // - result = condition ? expression1 : expression2;
        //example 1
        int num= -5;
        String result = num>0 ? "positive" :"negative";
        System.out.println(result);

        //exasmple 2
        int age =19;
        System.out.println(age>18 ?"allowed to vote":"not allowed to vote");

        // example 3
        // find maximun of two number

        int x=50;
        int y=30;
        System.out.println(x>y ? x:y);



    }
}
