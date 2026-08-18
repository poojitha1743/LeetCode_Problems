class Solution {
public:
    vector<int> intersection(vector<int>& nums1, vector<int>& nums2) {
       vector<int> ans;
       map<int,int> mp;
       for(int n1:nums1)
       {
          mp[n1]++;
       }
       for(int n2:nums2)
       {
         if(mp.find(n2)!=mp.end())
         {
            ans.push_back(n2);
            mp.erase(n2);
         }
       }
       return ans;
    }
};