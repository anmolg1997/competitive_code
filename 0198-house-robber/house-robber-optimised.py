class Solution:
    def rob(self, nums: List[int]) -> int:

        n = len(nums)
        dp_p2 = 0
        dp_p1 = nums[0]
        dp_p0 = dp_p1
        
        for i in range(2,n+1):
            dp_p0 = (max(nums[i-1]+dp_p2, dp_p1))
            dp_p2, dp_p1 = dp_p1, dp_p0
        return dp_p0

