package oct.ex_18102024;

import java.util.Locale;
import java.util.Scanner;

public class Lab033
{
    public static void main(String[] args) {
        // Web Automation
        // I will ask user which browser you want me to run the code.
        // chrome -> execute chrome
        // firefox -> execute of firefox
        // edge -> edge browser cases
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser name");
        String browser = sc.next();
        browser=browser.toLowerCase();
        switch (browser)
        {
            case "chrome" :
                System.out.println("execute chrome code");
                System.out.println("open the url");
                break;
            case "edge":
                System.out.println("enter edge code");
                break;
            case "firefox":
                System.out.println("enter firefox code");
                break;
            default:
                System.out.println("dont know which browser i used");
                break;
        }
        System.out.println("loop end");
        sc.close();
    }
}
