package Day_3;
import java.util.Arrays;
import java.util.Scanner;

public class Search_2d{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the elements in the array : ");
        int[][] arr = new int[2][2];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.print("Enter the elements to search : ");
        int target = in.nextInt();
        System.out.print("The element is at : "+Arrays.toString(search(arr,target)));
        in.close();
    }
    
    public static int[] search(int[][] arr,int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(arr[i][j]==target)
                {return new int[] {i,j};}
            }
        }
        return new int[] {-1,-1};
    }
}
