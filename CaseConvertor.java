import java.util.*;

public class CaseConvertor
{
    public static void main(String [] args) throws InterruptedException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to case convertor...");
        System.out.println("Enter the String :-");
        String value = sc.next();


        System.out.println("Select one.");
        String  [] n = {"[1] UpperCase", "[2] LowerCase"};

        for(String i : n)
        {
            System.out.println(i);
        }

        int num = sc.nextInt();

        if(num == 1)
        {
            System.out.println(value.toUpperCase());
        }
        else
        {
            System.out.println(value.toLowerCase());
        }


    
    
    
    sc.close();
    }
}