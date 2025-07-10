package Day_5;
import java.util.Scanner;

public class Palindrone_no {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the No. to check : ");
        long a = in.nextLong();
        ToCheck(a);
    }

    static int ToCheck(long value){
        long i=0;
        long temp=value;
        while(value>0)
        {
            long rem = value%10;
            i=i*10+rem;
            value = value/10;
        }
        if(i==temp)
        {
            System.out.print("Give number is Pallidrone");
        }
        else
        {
            System.out.print("Give number is not Pallidrone");
        }
        return 0;
    }
}