class Solution:
    def isValid(self, string: str) -> bool:
        
        dic = {"}" : "{", 
               ")" : "(", 
               "]" : "["}
            
        stack = [];
        
        for s in string:            
            if s not in dic:
                stack.append(s);
            elif not stack or dic[s] != stack.pop():
                return False;
            
        
        return len(stack) == 0

 
        