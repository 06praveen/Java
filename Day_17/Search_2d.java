//Search a element in 3x3 2D Array
package Day_3;
import java.util.Arrays;
import java.util.Scanner;

public class Search_2d{
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
        System.out.print("Enter the elements to search : ");
        int target = in.nextInt();
        System.out.print("The element is at : "+Arrays.toString(search(arr,target)));   //Printing the position of element in a array
        in.close();
    }
    
    public static int[] search(int[][] arr,int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(arr[i][j]==target)
                {return new int[] {i,j};}           //If element is found, the code stop and display the output
            }
        }
        return new int[] {-1,-1};           //If element not found
    }
}
