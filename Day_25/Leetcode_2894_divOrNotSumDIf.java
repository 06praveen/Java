class Solution {
    public int differenceOfSums(int n, int m) {
        int isDiv=0;
        int isNotDiv=0;
        for(int i=1;i<=n;i++)
        {
            if(i%m!=0)
            {isNotDiv += i;}
            else
            {isDiv += i;}
        }
        return isNotDiv-isDiv;
    };
}
