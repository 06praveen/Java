//Revised the code to find the occurence of a no.
package Day_12;
import java.util.Scanner;

public class Quick_revise_1{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the no. : ");
        int n = in.nextInt();
        int temp=n;
        System.out.print("Enter the no. to find : ");
        int o = in.nextInt();
        int count=0,rem=0;
        while(n>0)
        {
            rem=n%10;
            if(rem==o)
            {
                count++;
            }
            n=n/10;
        }
        System.out.print("The "+o+" in no. "+temp+" occur "+count+" times");
        in.close();
    }
}
