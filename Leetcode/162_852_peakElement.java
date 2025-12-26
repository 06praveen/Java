//In both the questions 162 & 852 we have mountain arrays and we have to find the peek element in both the array.
//Mountain array means the array will increase till sometime and than start decreasing
//It can easily solved by O(n) by linear searchbut we have solve it in O(logn)
//First i will do the normal binary search but the condition i will put is if(arr[mid[)>arr[mid+1]) then the array is decreeasing
//then e=mid; and check for other possibble answer
class Solution {
    public int findPeakElement(int[] arr) {
        int n=arr.length;
        int s=0,e=n-1;
        while(e>s)
        {
            int mid=s+(e-s)/2;
            if(arr[mid]>arr[mid+1])
            {
                e=mid;
            }
            else 
            {
                s=mid+1;
            }
        }
        return e;
    }
}
