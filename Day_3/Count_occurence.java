package Day_3;
import java.util.Scanner;

public class Count_occurence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        long n = in.nextLong();   //long is used because the digit may big ex:phone no.
        System.out.print("Enter the number to check occurence : ");
        int p = in.nextInt();
        int i = 1;
        int count = 0;
        while (n>0)
        {
            Long rem = n % 10;   //By using this we will get the last digit of no.
            if(rem==p){
                count += 1;
            }
            n=n/10;   //The last digit gets removed
        }
        System.out.print("The Occurence of "+p+" is "+count);
    }
}
