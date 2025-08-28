class Solution {
    public int[] twoSum(int[] numbers, int target) 
    {
        //Hashmap<Integer,Integer> map = new Hashmap<>();
        int m=0;
        int n=numbers.length-1;
        while(m<n)
        {
            if(numbers[m]+numbers[n]==target)
            {

                return new int[]{m+1,n+1};
            }
            else if(numbers[m]+numbers[n]<target)
            {
                m++;
            }
            else
            {
                n--;
            }
        }
        return new int[]{-1,-1};
        

    }
}