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
