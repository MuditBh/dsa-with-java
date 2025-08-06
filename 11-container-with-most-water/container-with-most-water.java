class Solution {
    public int maxArea(int[] height) 
    {
        int l = 0;
        int r = height.length-1;
        int max = Integer.MIN_VALUE;
        while(l<r)
        {
            int wid = r-l;
            int len = Math.min(height[l],height[r]);
            int currwater = len*wid;
            max = Math.max(max,currwater);
            if(height[l]<height[r])
            {
                l++;
            }
            else
            {
                r--;
            }

        }   
        return max;
    }
}