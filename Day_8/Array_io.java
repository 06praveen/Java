//Starting Array
package Day_8;
import java.util.Scanner;

public class Array_io {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];                  //Initializing an array
        System.out.print("Enter the numbers : ");
        for(int i =0;i<5;i++)                    //Taking array input
        {
            arr[i] = in.nextInt();
        }
        for(int i =0;i<5;i++)                    //Displaying elements of array
        {
            System.out.print(arr[i]+ " ");
        }
    }
}
