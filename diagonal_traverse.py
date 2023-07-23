class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:

        m = len(mat)
        n = len(mat[0])
        
        up = True

        row, col = 0, 0
        lst = []

        while (row < m) & (col < n) : 

            if up:
                while (row>0) & (col<n-1):
                    lst.append(mat[row][col])
                    row-=1
                    col+=1
                lst.append(mat[row][col])

                if col==n-1:
                    row+=1
                else:
                    col+=1

            else:
                while (row<m-1) & (col>0):
                    lst.append(mat[row][col])
                    row+=1
                    col-=1
                lst.append(mat[row][col])

                if row==m-1:
                    col+=1
                else:
                    row+=1

            
            up = not up
        
        return lst
