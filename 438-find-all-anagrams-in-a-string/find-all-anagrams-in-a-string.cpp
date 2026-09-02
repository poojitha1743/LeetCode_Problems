class Solution {
public:
    vector<int> findAnagrams(string s, string p){
         vector<int> ans;

        if (p.length() > s.length())
            return ans;

        vector<int> pFreq(26, 0);
        vector<int> windowFreq(26, 0);

        // Count characters of p
        for (char ch : p) {
            pFreq[ch - 'a']++;
        }

        int windowSize = p.length();

        for (int i = 0; i < s.length(); i++) {

            // Add current character
            windowFreq[s[i] - 'a']++;

            // Remove character outside the window
            if (i >= windowSize) {
                windowFreq[s[i - windowSize] - 'a']--;
            }

            // Check if current window is an anagram
            if (pFreq == windowFreq) {
                ans.push_back(i - windowSize + 1);
            }
        }

        return ans;
        
    }
};