class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            int elements=0;
            while(nums[i]>0)
            {
                elements++;
                nums[i] /=10;
            }
            if(elements%2==0)
            {count++;}
        }
        return count;
    }
}
