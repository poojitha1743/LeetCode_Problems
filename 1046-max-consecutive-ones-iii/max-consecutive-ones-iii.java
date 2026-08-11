class Solution {
    public int longestOnes(int[] nums, int k) {
        int left =0;
        int zeroes_count=0;
        int max =0;
        for(int right =0;right<nums.length;right++)
        {
            // Maintain zeroes count
            if(nums[right]==0)
            {
                zeroes_count++;
            }
            // Check Window validity is broken , if yes , shrink till valid
            while(zeroes_count>k)
            {
                if(nums[left]==0)
                {
                    zeroes_count -=1;
                }
                left++;
                
            }
            // Update the max Valid Window
                max = Math.max(max,right-left+1);
            
        }
        return max;
    }
}