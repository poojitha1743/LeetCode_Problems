class Solution {
public:
    int numOfSubarrays(vector<int>& arr, int k, int threshold) {
       int left =0;
       int current_sum =0;
       int count=0;
       int avg =0;
       for(int right=0;right<arr.size();right++)
       {
        current_sum+=arr[right];
        if(right>=k-1)
        {
            avg = current_sum/k;
            if(avg>=threshold)
         {
            count++;
         }
            current_sum-=arr[left];
            left++;
        }
        
       } 
       
       return count;
    }
};