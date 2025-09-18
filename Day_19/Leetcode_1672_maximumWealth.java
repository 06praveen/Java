//Find the maximum wealth of customer [2-D Array]
class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        for(int i=0;i<accounts.length;i++)     //Customers
        {
            int sum=0;
            for(int j=0;j<accounts[i].length;j++)     //Bank Accounts
            {
                sum=sum+accounts[i][j];          //Total wealth of each customer
            }
            if(sum>max)
            {
                max=sum;
            }
        }
        return max;           //Maximum wealth among all the customer
    };
}
