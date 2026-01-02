//We have to find the repeated element in the given array and return the repeated integer
//array contain 'n+1' unique element
class Solution {
    public int repeatedNTimes(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {return arr[i];}
            }
        }
        return -1;
    }
}
//Time Complexity - O(N^2)
//Space Complexity - O(1)
