//Here we have to remove the element from from the array
class Solution {
    public int removeElement(int[] arr, int val) {
        int n=arr.length;
        int j=n-1;
        for(int i=0;i<=j;i++)           //two pointer logic
        {
            if(arr[j]==val)
            {
                i--;
                j--;
            }
            else if(arr[i]==val)
            {
                arr[i]=arr[j];
                j--;
            }
        }
        return j+1;
    }
}
