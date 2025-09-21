//Revised the problem for sum of diagonal matrix in a 2D Array
public class Revising_problem{
    public static void main(String[] args){
        int[][] mat = {{7,18,3},
                       {18,7,3},
                       {3,18,7}};
        int ans = MatrixDiagonalSum(mat);
        System.out.print("The Sum of Diagonal of matrix is : "+ans);
    }
    public static int MatrixDiagonalSum(int[][] mat){
        int sum = 0;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[i].length;j++)
            {
                if(i==j)
                {
                    sum += mat[i][j];
                }
                else if(i+j==mat.length-1 & i!=j)
                {
                    sum += mat[i][j];
                }
            }
        }
        return sum;
    }
}
