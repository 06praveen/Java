//Finding duplicate element from the array using O(n) time complexity using an absolute difference approach
//In this approach we will first negative to all the element and 
//if it again points to the negative element then the index is the answer
class Solution {
    public int findDuplicate(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            int index=Math.abs(arr[i]);
            if(arr[index]<0)
            {return index;}
            arr[index]=-arr[index];
        }
        return -1;
    }
}
//Time Complexity=O(n)
//Space Complexity=O(1)
