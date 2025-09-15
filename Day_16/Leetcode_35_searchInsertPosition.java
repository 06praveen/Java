class Solution {
    public int searchInsert(int[] nums, int target) {
        int low=0,high=nums.length-1;
        while(high>=low)
        {
            int mid=(low+high)/2;
            if(nums[mid]==target)
            {return mid;}
            if(nums[mid]>target)         //Binary Search Algorithm
            {high=mid-1;}
            else
            {low=mid+1;}
        }
        return low;
    };
}
