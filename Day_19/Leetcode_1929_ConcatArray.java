//Concatenation of Array with 2 loops
class Solution {
    public int[] getConcatenation(int[] nums) {
      int[] arr = new int[(2*nums.length)];    //Created a new array of double size of 1st array
      for(int i=0;i<nums.length;i++)
        {
          arr[i] = nums[i];              //Coppying the elements of given array 
          arr[i+nums.length] = nums[i];        //Copying the elements of given array again 
        }
      return arr;
    }
}
