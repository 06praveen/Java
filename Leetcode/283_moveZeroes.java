//In this problem we have to move all the zeroes to the end in a given a array
//Condition is the time complexity - o(n)
class solution{
  public void moveZeroes(int[] arr){
    int n=arr.length;
    int j=0;
    for(int i=0;i<n;i++)
      {
        if(arr[i]!=0)
        {
          arr[j]=arr[i];              //Copying all the elements other than zeroes in the same arr
          j++;
        }
      }

    while(j<n)
      {
        arr[j]=0;            //putting zeroes in the remaining
        j++;
      }
  }
}
// Time Complexity - O(n)
// Space Complexity - O(1)
