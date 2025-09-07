//Code for linear search in array using function
package Day_14;
import java.util.Scanner;
import java.util.Arrays;

public class MyClass {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the size of array : ");
    int n = in.nextInt();
    System.out.print("\nEnter the elements of array : ");
    int[] arr = new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i] = in.nextInt();
    }
    System.out.print("Enter the element to find : ");
    int f = in.nextInt();
    search(n,arr,f);
  }
  
  public static void search(int x,int[] y,int s)
  {
      int k =0;
      for(int j=0;j<x;j++)
      {
          if(y[j]==s)
          {
              k=1;
              break;
          }
      }
      if(k==1)
      {
          System.out.print("Element "+s+" is found");
      }
      else
      {
          System.out.print("Element "+s+" is not found");
      }
  }
}
