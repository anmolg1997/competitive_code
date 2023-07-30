class Solution:
    def minEatingSpeed(self, piles: List[int], h: int) -> int:

        def hours_taken(i, piles):
            hrs = 0
            for p in piles:
                hrs+=(p//i) + 1 if (p%i)>0 else p/i
            print("hrs", hrs)
            return hrs

        max_ = max(piles)
        i,j = 1, max_
        mid = (1 + max_)// 2

        while i <= j:
            print("i, j, mid :", i, j, mid)
            hrs_taken = hours_taken(mid, piles) <= h

            if hrs_taken:
                j = mid-1
            else:
                i = mid+1
            
            mid = i + (j-i)//2

        print("final : i, j, mid :", i, j, mid)
        return i
