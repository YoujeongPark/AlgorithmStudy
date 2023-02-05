class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        
        for i in range(0, len(nums)):
            for j in range(i, len(nums)):
                if nums[j] + nums[i] == target and i != j:
                    return [i,j]