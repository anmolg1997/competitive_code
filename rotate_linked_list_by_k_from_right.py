# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def rotateRight(self, head: Optional[ListNode], k: int) -> Optional[ListNode]:
        
        if k==0 or head is None:
            return head
        
        len_ = 1
        curr = head
        while curr.next != None:
            len_+=1
            curr = curr.next

        curr.next = head

        k = k%len_

        for i in range(len_-k):
            curr = curr.next

        head = curr.next
        curr.next = None

        return head
        

            



