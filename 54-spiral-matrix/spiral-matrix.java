class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int startrow = 0;
        int startcol = 0;
        int endrow = matrix.length-1;
        int endcol = matrix[0].length-1;
        while(startrow<=endrow && startcol<=endcol)
        {
            //top
            for(int i=startcol;i<=endcol;i++)
            {
                result.add(matrix[startrow][i]);
            }
            //right
            for(int i=startrow+1;i<=endrow;i++)
            {
                result.add(matrix[i][endcol]);
            }
            //bottom
            for(int i=endcol-1;i>=startcol;i--)
            {
                if(startrow==endrow)
                {
                    break;
                }
                result.add(matrix[endrow][i]);
            }
            //left
            for(int i=endrow-1;i>=startrow+1;i--)
            {
                if(startcol==endcol)
                {
                    break;
                }
                result.add(matrix[i][startcol]);
            }
            startrow++;
            startcol++;
            endrow--;
            endcol--;
        }
        return result;
    }
}