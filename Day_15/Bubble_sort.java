package Day_15;
import java.util.Arrays;
import java.util.Scanner;

public class Bubble_sort {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = in.nextInt();
        System.out.print("\nEnter the elements of array : ");
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i] = in.nextInt();
        }
        Sort(arr);
        in.close();
    }

    public static void Sort(int[] arr)
    {
        int temp=0;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.print("The sorted array is : "+Arrays.toString(arr));
    }
}
