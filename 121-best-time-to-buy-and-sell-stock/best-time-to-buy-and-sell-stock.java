class Solution {
    public int maxProfit(int[] prices) {
        int bp = Integer.MAX_VALUE;
        int mp = 0;
        for(int i=0;i<prices.length;i++)
        {
            if(bp<prices[i])
            {
                int p = prices[i] - bp;
                mp = Math.max(p,mp);
            }
            else
            {
                bp = prices[i];
            }
        }
        return mp;
        
    }
}