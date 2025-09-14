package Day_15;
import java.util.Scanner;

public class Max_value {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = in.nextInt();
        System.out.print("\nEnter the elements of array : ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = in.nextInt();
        }
        System.out.print("\nThe Maximum value in the array is : "+Max(arr));
        in.close();
    }

    public static int Max(int[] arr){
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        return max;
    }
}
