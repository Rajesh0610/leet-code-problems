class Solution {
    public int search(int[] nums, int target) {
        int r=0;
        int l=nums.length-1;
        while(r<=l)
        {
            int n=r+(l-r)/2;
            if(nums[n]<target)
            {
                r=n+1;
            }
            else if(nums[n]>target)
            {
                l=n-1;
            }
            if(nums[n]==target)
            {
                return n;
            }
        }
        return -1;
    }
}