class Solution:
    def isPowerOfTwo(self, n: int) -> bool:
    
        def isPower(_number):
            if pow(2,_number) == n:
                return True
            elif pow(2,_number) < n :
                return isPower(_number+1);
            else:
                return False;
            
            
        
        return isPower(0)