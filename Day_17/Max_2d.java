package Day_3;
import java.util.Arrays;
import java.util.Scanner;

public class Max_2d{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the elements in the array : ");
        int[][] arr = new int[3][3];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.print("The Maximum value in the array is : "+Arrays.toString(search(arr)));
        in.close();
    }
    
    public static int[] search(int[][] arr)
    {
        int max = arr[0][0];
        for(int i=1;i<arr.length;i++)
        {
            for(int j=1;j<arr[i].length;j++)
            {
                if(arr[i][j]>max)
                {max=arr[i][j];}
            }
        }
        return new int[] {max};
    }
}
