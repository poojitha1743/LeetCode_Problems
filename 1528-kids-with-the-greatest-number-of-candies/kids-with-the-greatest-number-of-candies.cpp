class Solution {
public:
    vector<bool> kidsWithCandies(vector<int>& candies, int extraCandies) {
        vector<bool> ans;
        int maxSum =0;
        for(int i=0;i<candies.size();i++)
        {
            if(candies[i]>maxSum)
            {
                maxSum = candies[i];
            }
        }
        for(int i=0;i<candies.size();i++)
        {
            if(maxSum<=candies[i]+extraCandies)
            {
                ans.push_back(true);
            }
            else
            {
                ans.push_back(false);
            }
        }
       return ans; 
        
    }
};