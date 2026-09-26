class Solution {
public:
    int firstMissingPositive(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        nums.erase(unique(nums.begin(),nums.end()),nums.end());
        int x=1;
        for(int i=0;i<nums.size();i++)
        {
            if(nums[i]<=0)
            {
               continue;
            }
            else if(nums[i]==x)
            {
                x++;
            }
            else
            {
                return x;
            }
        }
        return x;
    }
};