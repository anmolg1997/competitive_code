class Solution:
    def uniquePaths(self, m: int, n: int) -> int:
        # 1. Tabulation Approach
        #f(m-1,n-1) = f(m-2,n-1) + f(m-1,n-2)
        i=0
        j=0
        dp = [[0]*n for _ in range(m)]
        dp[0][0] = 1

        for i in range(0,m):
            for j in range(0,n):
                if (i==0) or (j==0):
                    dp[i][j] = 1
                    continue
                dp[i][j] = dp[i-1][j] + dp[i][j-1]
        return dp[m-1][n-1]