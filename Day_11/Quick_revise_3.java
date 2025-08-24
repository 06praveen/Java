package Day_11;
import java.util.Scanner;

public class Quick_revise_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the no. to reverse : ");
        long n = in.nextLong();
        long rev=0,temp=n;
        while(n>0)
        {
            long rem = n%10;
            rev = rem + (rev*10);
            n=n/10;
        }
        System.out.print("The revsere no. of "+temp+" is : "+rev);
    }
}
