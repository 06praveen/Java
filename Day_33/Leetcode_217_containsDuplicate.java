//Solved the leetcode problem to check the array contain duplicate number or not
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                return true;
            }
        }
        return false;
    }
}
// Time Complexity - O(n)
// Space Complexity - O(1)
