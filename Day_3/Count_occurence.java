package Day_3;
import java.util.Scanner;

public class Count_occurence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        long n = in.nextLong();
        System.out.print("\nEnter the number to check occurence : ");
        int p = in.nextInt();
        int i = 1;
        int count = 0;
        while (n>0)
        {
            long rem = n % 10;
            if(rem==p){
                count += 1;
            }
            n=n%10;
        }
        System.out.print("\nThe Occurence of "+p+" in "+n+" is "+count);
    }
}
