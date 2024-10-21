package oct.ex_14102024;

public class Lab013
{
    public static void main(String[] args) {
        //type casting = convert a variable from one data type to another.


        // widening - implicit , explicit -lossless
        byte b=10;
        int a= b; // valid - implicit = mean done automatically with jvm
        int a1 = (int) b;// valid -> Explicit Casting - JVM

        // narrowing - Implicit , Explicit (with data type), loss

     int val=200;
    // byte a2=val -->invalid - implicit not possible in narrowing type casting
     byte a3 =(byte)val; // explicit type casting possible in narrowing type casting
    }
}
