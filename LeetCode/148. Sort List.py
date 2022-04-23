# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def sortList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        def dfs(_head):
            if _head is None:
                return; 
            
            linkedList.append(_head.val)
            dfs(_head.next); 
        
        linkedList = [];
        dfs(head)
        linkedList.sort(reverse=True);
        
        prev : ListNode = None
        node = ListNode(''); 
        for linked in linkedList:
            node = ListNode(linked);
            node.next = prev; 
            prev = node; 
            
        return node
        