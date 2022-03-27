class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:       
        
        
        def dfs(_nums,_tmp):
            if not _nums:
                result.append(_tmp);
                return; 
            
            for i in range(len(_nums)):
                dfs(_nums[:i] + _nums[i+1:], _tmp + [_nums[i]])
            
                
        result = []
        dfs(nums, []) 
        return result;