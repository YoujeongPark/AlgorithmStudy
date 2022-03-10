# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def buildTree(self, preorder: List[int], inorder: List[int]) -> Optional[TreeNode]:
        
        def constructTree(_preorder, _inorder):
            if _inorder:
                node = _inorder.index(_preorder.pop(0));
                root = TreeNode(_inorder[node]);
                root.left = constructTree(_preorder, _inorder[0:node]);
                root.right = constructTree(_preorder, _inorder[node+1:]);
                return root; 
            
        return constructTree(preorder, inorder);  
        
    
        
        
    # def buildTree(self, preorder, inorder):
    #     if inorder:
    #         ind = inorder.index(preorder.pop(0))
    #         root = TreeNode(inorder[ind])
    #         root.left = self.buildTree(preorder, inorder[0:ind])
    #         root.right = self.buildTree(preorder, inorder[ind+1:])
    #         return root
            
            