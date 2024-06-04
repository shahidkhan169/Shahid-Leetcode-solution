class Solution {
    public boolean isMonotonic(int[] nums) {
        int f=0;
        boolean inc=true;
        boolean dec=true;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]>nums[i+1])
                inc=false;
            else if(nums[i]<nums[i+1])
                dec=false;
        }
        return inc||dec;
    }
}