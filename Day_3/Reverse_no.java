package Day_3;
import java.util.Scanner;

public class Reverse_no {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number to reverse : ");
        long n = in.nextLong();      //long is use for big numbers
        long i=0;
        while(n>0)
        {
            long rem = n%10;
            i=i*10+rem;         //the number get added is reverse order
            n=n/10;
        }
         System.out.print("The reverse number is : "+i);
    }
}
