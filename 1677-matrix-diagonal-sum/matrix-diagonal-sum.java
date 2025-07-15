class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for(int i=0;i<mat.length;i++)
        {
            //primary
            sum+=mat[i][i];
            //secondary
            if(i!=mat.length-1-i)
            {
            sum+=mat[i][mat.length-1-i];
            }
        }
        return sum;
        
    }
}