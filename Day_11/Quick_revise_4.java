package Day_11;
import java.util.Scanner;

public class Quick_revise_4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the no. to check Palindrome : ");
        long n = in.nextLong();
        long temp=n,rev=0;
        while(n>0)
        {
            long rem = n%10;
            rev=rem+(rev*10);
            n=n/10;
        }
        if(rev==temp)
        {
            System.out.print("The number "+temp+" is a Palindrome");
        }
        else
        {
            System.out.print("The number "+temp+" is not a Palindrome");
        }
        in.close();
    }
}
