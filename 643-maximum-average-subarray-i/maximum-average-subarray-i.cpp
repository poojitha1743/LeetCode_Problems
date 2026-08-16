class Solution {
public:
    double findMaxAverage(vector<int>& nums, int k) {
        int left = 0;
        double  current_sum=0;
        double max_avg = -1000000;
        for(int right=0;right<nums.size();right++)
        {
            current_sum +=nums[right];
            if(right>=k-1)
            {
                max_avg = max(current_sum/k,max_avg);
                current_sum-=nums[left];
                left++;
            }
        }
       return max_avg; 
    }
};