//Solved the leetcode problem to sort colors in binary in a array 
class Solution {
    public void sortColors(int[] nums) {
        int temp=0;
        for(int i=0;i<nums.length-1;i++)                 //Bubble Sort Algorithm
        {
            for(int j=0;j<nums.length-1-i;j++)
            {
                if(nums[j]>nums[j+1])
                {
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                };
            }
        }
    };
}
