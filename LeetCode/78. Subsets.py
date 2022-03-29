class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        
        def dfs(_route):
            result.append(_route)
            
            for num in nums:
                if len(_route) > 0 :
                    if _route[-1] < num : 
                        dfs(_route + [num]);
                else:
                    dfs(_route + [num])
            
            
            
        
        result = []; 
        dfs([])
        return result; 
    