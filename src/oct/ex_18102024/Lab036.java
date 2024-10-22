package oct.ex_18102024;

public class Lab036
{
    public static void main(String[] args) {
        int itemcode=004;
        switch (itemcode)
        {
            case 002,004,005:
                System.out.println("electronic item");
            break;
            case 006,007,003:
                System.out.println("mechnical item");
                break;
            default:
                System.out.println("no item");
                break;
        }
    }
}
