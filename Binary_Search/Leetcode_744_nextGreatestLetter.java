//Write a java code to find the smallest letter greater than target using Binary search
class solution{
  public char nextGreatestLetter(char[] arr,int target){
    int n=arr.length;
    int s=0,e=n-1;
    if(arr[n]<target)
    {return arr[0];}
    else
    {
      while(s<=e)
        {
          int mid = s+((e-s)/2);
          if(arr[mid]<=target)
          {s=mid+1;}
          else
          {e=mid-1;}
        }
      return arr[s%n];
    }
  }
}
