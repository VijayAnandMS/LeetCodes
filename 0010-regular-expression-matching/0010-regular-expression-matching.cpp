class Solution {
public:
    bool isMatch(string s, string p) {
        int m = s.size(), n = p.size();
        
        vector<vector<bool>> ve(m + 1, vector<bool>(n + 1, false));
        ve[0][0] = true;
        
        for (int j = 1; j <= n; j++) {
            if (p[j - 1] == '*') {
                ve[0][j] = ve[0][j - 2];
            }
        }
        
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (p[j - 1] == '*') {
                    ve[i][j] = ve[i][j - 2];
                    if (p[j - 2] == '.' || p[j - 2] == s[i - 1]) {
                        ve[i][j] = ve[i][j] || ve[i - 1][j];
                    }
                } else {
                    if (p[j - 1] == '.' || p[j - 1] == s[i - 1]) {
                        ve[i][j] = ve[i - 1][j - 1];
                    }
                }
            }
        }
        
        return ve[m][n];
    }
};