class Solution:
    def missingNumber(self,array,n):
        missing_num = 0
        
        for i in range(n):
            missing_num^=(i+1)
        for i in array:
            missing_num^=i
        
        return missing_num
