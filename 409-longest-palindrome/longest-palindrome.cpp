class Solution {
public:
    int longestPalindrome(string s) {
       int frq[128]= {0};
       for(char c:s)
       {
          frq[c]++;
       } 
       int ans =0;
       bool odd = false;
       for(int i=0;i<128;i++)
       {
         ans+=(frq[i]/2)*2;
         if(frq[i]%2==1)
         {
            odd = true;
         }
       }
       if(odd)
       {
        ans++;
       }
       return ans;
    }
};