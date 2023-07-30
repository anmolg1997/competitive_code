# 430. Flatten a Multilevel Doubly Linked List
# https://leetcode.com/problems/flatten-a-multilevel-doubly-linked-list/

"""
# Definition for a Node.
class Node:
    def __init__(self, val, prev, next, child):
        self.val = val
        self.prev = prev
        self.next = next
        self.child = child
"""

class Solution:
    def flatten(self, head: 'Optional[Node]') -> 'Optional[Node]':

        if head is None:
            return head

        curr  = head
        while curr is not None:

            if curr.child is None:
                curr = curr.next
                continue

            curr = self.merge(curr)

            # move to the next node
            curr = curr.next
        return head

    def merge(self, curr):
            n = curr.next
            c = curr.child

            # traverse child list until we get the last node
            while c.next is not None:
                c = c.next

            # child is now pointing at the last node of the child list
            # we need to connect child.next to current.next, if there is any
            if n is not None:
                c.next = n
                n.prev = c

            # redirect child & curr connection to be set as next & prev
            curr.next = curr.child
            curr.next.prev = curr

            #set child to none
            curr.child = None

            return curr
