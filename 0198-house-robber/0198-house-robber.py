class Solution:
    def rob(self, nums: List[int]) -> int:

        n = len(nums)
        dp = [0, nums[0], ]

        for i in range(2,n+1):
            print(i)
            dp.append(max(nums[i-1]+dp[i-2], dp[i-1]))
            print(dp)
        return dp[n]


   