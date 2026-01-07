//Solved a Hard leetcode problem to find minimum in a rotated sorted array containing duplicate elements using binary search
class Solution {
    public int findMin(int[] arr) {
        int n=arr.length;
        return binarySearch(arr,n);
    }

    public int binarySearch(int[] arr,int n){
        int s=0,e=n-1;
        while(e>s)
        {
            int mid=s+(e-s)/2;
            if(arr[mid]>arr[e])
            {
                s=mid+1;
            }
            else if (arr[mid] < arr[e])
            {
                e = mid;
            } 
            else 
            {
                e--;
            }
        }
        return arr[s];
    }
}
