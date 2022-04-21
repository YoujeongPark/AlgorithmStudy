class Solution:
    def largestNumber(self, nums: List[int]) -> str:
        
#         print("123" < "333")
#         print("123" > "333")
        
        # def swap(n1 : int, n2 : int) -> bool:
        #     return str(n1) + str(n2) < 

        for i in range(0,len(nums)):
            for j in range(i+1,len(nums)):
                if str(nums[i]) + str(nums[j]) < str(nums[j]) + str(nums[i]):
                    nums[i], nums[j]  = nums[j], nums[i]
        
        result = [str(x) for x in nums]
        return str(int(''.join(result)))