//Code is to find the first and last occurence of an given target in a given array or return {-1,-1)
class Solution {
    public int[] searchRange(int[] arr, int target) {
        if(arr.length<1)
        {return new int[] {-1,-1};}
        int[] ans={-1,-1};
        ans[0] = FirstSearch(arr,target);
        ans[1] = LastSearch(arr,target);
        return ans;
    }
  
    //To find the first occurence of the element from the starting
    public int FirstSearch(int[] arr,int target)
    {
        int n=arr.length;
        int s=0,e=n-1;
        int ans=-1;
        while(e>=s)
        {
            int mid=s + (e-s)/2;
            if(arr[mid]==target)
            {
                ans=mid;
                e=mid-1;
            }
            else if(arr[mid]>target)
            {e=mid-1;}
            else
            {s=mid+1;}
        }
        return ans;
    }
  
        //To find the last occurence of the element from the starting
        public int LastSearch(int[] arr,int target)
    {
        int n=arr.length;
        int s=0,e=n-1;
        int ans=-1;
        while(e>=s)
        {
            int mid=s + (e-s)/2;
            if(arr[mid]==target)
            {
                ans=mid;
                s=mid+1;
            }
            else if(arr[mid]>target)
            {e=mid-1;}
            else
            {s=mid+1;}
        }
        return ans;
    }
}
