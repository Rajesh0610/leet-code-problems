class Solution {
    public int maxProduct(int[] nums) {
        int max=Integer.MIN_VALUE;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++)
        {
            if((nums[i-1]-1)*(nums[i]-1)>max)
            {
                max=(nums[i-1]-1)*(nums[i]-1);
            }
        }
        if(max>0) return max;
        else return 0;
    }
}