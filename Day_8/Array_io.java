//Starting Array
package Day_8;
import java.util.Scanner;

public class Array_io {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.print("Enter the numbers : ");
        for(int i =0;i<5;i++)
        {
            arr[i] = in.nextInt();
        }
        for(int i =0;i<5;i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }
}
