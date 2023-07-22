class Solution:
    def maximumSumSubarray (self,K,Arr,N):
        # code here 
        if K>N:
            return -1
        else:
            max_sum = sum(Arr[:K])
            sum_lst = [max_sum, ]
            for i in range(1, N-K+1):
                max_sum += Arr[i+K-1]-Arr[i-1]
                sum_lst.append(max_sum)
                    
        return max(sum_lst)
                
