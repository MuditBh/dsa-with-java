class Solution {
    public int search(int[] nums, int target)
    {
        int si = 0;
        int ei = nums.length-1;
        while(si<=ei)
        {
            int mid = si + (ei-si)/2;
            if(target==nums[mid])
            {
                return mid;
            }
            //case 1: mid on L1
            if(nums[si]<=nums[mid])
            {
                //left of L1
                if(nums[si]<=target&&target<nums[mid])
                {
                    ei = mid-1;
                }
                //right of L1
                else
                {
                    si = mid+1;
                }
            }
            //case 2: mid on L2
            else
            {
                //right of L2
                if(nums[mid]<target&&target<=nums[ei])
                {
                    si = mid+1;
                }
                //left of L2
                else
                {
                    ei = mid-1;
                }
            }
        }
        return -1;//not found
        
    }
}