

// class Solution{
// public:
//    int countSubarrays(vector<int>& nums){
//     int len = nums.size();
//     int ans = 0;
//     for(int i =0; i<len; i++)
//     {
//         if(i<=len-3){
//             if(nums[i]+nums[i+2]==double(nums[i+1])/2)
//             ans++;
//         }
//     }
//    return ans;
// }
// };

class Solution{
    public:
    int mod = 1e9+7;
    int countPathsWithXorValue(vector<vector><int>>& grid, int k{
        int m = grid.size(), n =grid[0].size();
        vector<vector<vector<int>>> adj(m, vector<vector<int>>(n,vector<int>(16,0)));
        
        adj[0][0][grid[0][0]]=1;

        for(int x=0; i<m; x++){
            for(int j=0; j<n; j++){
                for(int x=0; x<16; x++){
                    if(j+1<n)
                    adj[i][j+1][x^grid[i][j+1]]=
                    (adj[i+1][j]{x^grid[i+1][j]]+adj[i][j][x]%mod})
                }
            }
        }

    })
}