# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def partition(self, head: Optional[ListNode], x: int) -> Optional[ListNode]:
        
        if head is None:
            return head
        
        left, right = ListNode(0), ListNode(0)
        l, r = left, right
        
        while head is not None:
            
            if head.val < x:
                l.next = head
                l = l.next
            else:
                r.next = head
                r = r.next
                
            head = head.next
            
            
        r.next = None
        l.next  = right.next

        return left.next
            
                
                
            
        