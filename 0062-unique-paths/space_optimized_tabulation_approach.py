class Solution:
    def uniquePaths(self, m: int, n: int) -> int:
        # 1. Optimized 1D - Tabulation Approach
        #f(m-1,n-1) = f(m-2,n-1) + f(m-1,n-2)
        i=0
        j=0
        dp = [0]*n

        for i in range(0,m):
            for j in range(0,n):
                if (i==0) or (j==0):
                    dp[j] = 1
                    continue
                if j==1:
                    dp[j] = i
                dp[j] = dp[j] + dp[j-1]
        return dp[n-1]
