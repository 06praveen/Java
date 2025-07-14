//2D array used to create matrix
package Day_8;
import java.util.Arrays;
import java.util.Scanner;

public class Array_twoD {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.print("Enter the Arrays[2D] Elements : ");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.print(Arrays.deepToString(arr)+"\n");

        int[][] arr2D = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.print(Arrays.deepToString(arr2D)+"\n");
    }
}
