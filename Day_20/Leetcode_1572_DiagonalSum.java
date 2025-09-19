//Solved the leetcode question to return the sum of diagonal elements of a 2D Array
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        for(int i=0;i<mat.length;i++)
            {
                for(int j=0;j<mat[i].length;j++)
                    {
                        if(i==j)
                        {
                            sum = sum + mat[i][j];     //left to right Diagonal Elemnts are added
                        }
                        if(i+j==mat.length-1)        
                        {
                            if(i==j)
                            {continue;}
                            else
                            {sum = sum + mat[i][j];}        //right to left Diagonal elements are added
                        }
                    }
            }
        return sum;
    }
}
