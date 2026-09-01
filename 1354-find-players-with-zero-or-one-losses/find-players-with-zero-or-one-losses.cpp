class Solution {
public:
    vector<vector<int>> findWinners(vector<vector<int>>& matches) {
       unordered_map<int, int> losses;
        for (auto match : matches) {
            int winner = match[0];
            int loser = match[1];

            if (losses.find(winner) == losses.end()) {
                losses[winner] = 0;
            }

           
            losses[loser]++;
        }

        vector<int> zeroLoss;
        vector<int> oneLoss;

        
        for (auto p : losses) {
            
            if (p.second == 0) {
                zeroLoss.push_back(p.first);
            }
            else if (p.second == 1) {
                oneLoss.push_back(p.first);
            }
        }
        sort(zeroLoss.begin(), zeroLoss.end());
        sort(oneLoss.begin(), oneLoss.end());

        return {zeroLoss, oneLoss}; 
    }
};