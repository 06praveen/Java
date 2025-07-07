package Day_3;
import java.util.Scanner;

public class Case_check{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the character to check : ");
        char ch = in.next().trim().charAt(0);         //trim is use to avoid spacing
        if(ch>='a' && ch<='z')
        {
            System.out.println("Character : "+ch+" is in Lowercase");
        }
        else if(ch>='A' && ch<='Z')
        {
            System.out.println("Character : "+ch+" is in Uppercase");
        }
        else
        {
            System.out.println("Invalid Character!");
        }
    }
}
