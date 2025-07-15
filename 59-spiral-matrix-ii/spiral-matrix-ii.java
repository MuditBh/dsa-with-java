class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];
        int startrow = 0;
        int startcol = 0;
        int endrow = n - 1;
        int endcol = n - 1;
        int value = 1;
        while (startrow <= endrow && startcol <= endcol) {
            //top
            for (int i = startcol; i <= endcol; i++) {
                arr[startrow][i] = value++;
            }
            //right
            for (int i = startrow + 1; i <= endrow; i++) {
                arr[i][endcol] = value++;
            }
            //bottom
            for (int i = endcol - 1; i >= startcol; i--) {
                if (startrow == endrow) {
                    break;
                }
                arr[endrow][i] = value++;
            }
            //left
            for (int i = endrow - 1; i >= startrow + 1; i--) {
                if (startcol == endcol) {
                    break;
                }
                arr[i][startcol] = value++;
            }
            startrow++;
            startcol++;
            endrow--;
            endcol--;
        }
        return arr;
        
    }
}