# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        
        def mergeTwoLists2(l1, l2):
            if not l1 or not l2:
                return l1 or l2
            if l1.val < l2.val:
                l1.next = mergeTwoLists2(l1.next, l2)
                return l1
            else:
                l2.next = mergeTwoLists2(l1, l2.next)
                return l2
                
       
        result = mergeTwoLists2(list1, list2)
        print(result)
        return result
        