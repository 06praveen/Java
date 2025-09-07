//Create a array of your own size to store similar elements
package Day_13;
import java.util.Arrays;
import java.util.Scanner;

public class Array_revised{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the sie of array : ");
        int n = in.nextInt();
        System.out.print("\nEnter the element of array : ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.print("\nThe element of array are : "+Arrays.toString(arr));
    }
}
