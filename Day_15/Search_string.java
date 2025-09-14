package Day_15;
import java.util.Scanner;

public class Search_string {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s = in.nextLine();
        System.out.print("Enter the character : ");
        String str = in.next();
        char c = str.trim().charAt(0);
        search(s,c);
        in.close();
    }

    public static void search(String str,char c){
        int y=0;
        for(int i=0;i<str.length();i++)
        {
            if(c==str.charAt(i))
            {
                y=1;
                break;
            }
        }
        if(y==1)
        {
            System.out.print("\nCharacter "+c+" is found in String "+str);
        }
        else
        {
            System.out.print("\nCharacter "+c+" is not found in String "+str);
        }
    }
}
