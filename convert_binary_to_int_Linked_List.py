# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def getDecimalValue(self, head: ListNode) -> int:
        len_ = 1
        curr = head
        while curr.next is not None:
            len_+=1
            curr = curr.next
        curr = head
        int_val = 0
        for i in range(len_):

            int_val+=(curr.val * (2**(len_-i-1)))
            curr = curr.next

        return int_val
