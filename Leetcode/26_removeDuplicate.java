//A sorted array is given with duplicate numbers in which we have to remove the duplicate element
class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n<2)                //If array has only one elments than no duplicates
        {return 1;}
        int j=0;
        for(int i=1;i<n;i++)
        {
            if(nums[i]!=nums[j])             //If number is not same copy it
            {
                j++;
                nums[j]=nums[i];
            }
        }
        return j+1;
    }
}
