package oct.ex_11102024;

public class Lab011
{
    public static void main(String[] args) {
        //assignment operator
       // int a = 10; // = here is assignment operators assign the value from right to the left.
        //	2. Arithmetic Operators -> Used for basic mathematical operations.
        //		1. + (Addition)
        //		2. - (Subtraction)
        //		3. * (Multiplication)
        //		4. / (Division)
        //		5. % (Modulo)

        int a =13;
        int b=10;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        // relational operator = compare between two value
        // 3. Relational Operators -> Used to compare two values.// always return true or false
        //		○ < (Less than)
        //		○ <= (Less than or equal to)
        //		○ > (Greater than)
        //		○ >= (Greater than or equal to)
        //		○ == (Equal to)
        //!= (Not equal to)
        int c= 30;
        int d =40;
        System.out.println(c>d);//false
        System.out.println(a<b);//false
        int e =35;
        int f=35;
        System.out.println(e>=f);//true
        System.out.println(e<=f);// true

        //unary operators
        int g= 65;
        int h=-2;
        h=h+2;
        System.out.println(h);

       String first_name ="shashank";
       String Last_name = "jain";
       int k=21;
       int s=29;
       System.out.println(first_name+Last_name+k+s);
       // first operator performed as concatination  // result = shashankjain2129
        System.out.println(k+s+first_name+Last_name);// first maths operation then concatination

      // Logical Operators ->
        //- `&&`  (AND)
        //- `||`  (OR)
        //- `!`  (NOT)

      boolean n = true;
      boolean m = false;
      System.out.println(n&&m);// false
         System.out.println(n||m);//true
        System.out.println(!m);//true
        System.out.println(!n);//false
        System.out.println(!!n);//true
        System.out.println(!!m);//false

        //Compound Assignment Operators
       int vaule1 =20;
      // vaule1 +=20;
      // vaule1 -=20;
        // vaule1 /=20;
       vaule1 *=20;
        System.out.println(vaule1);

       // new operators
       String name = new String("shashank");
       // new - new memory or object in heap area






    }
}
