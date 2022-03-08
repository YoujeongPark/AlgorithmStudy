class Solution:
    def letterCombinations(self, digits: str) -> List[str]:
             
        def dfs(_index, _path):
            if len(_path) == len(digits):
                result.append(_path)
                return 
                
                
            for i in range(_index, len(digits)):
                for j in dic[digits[i]]:
                    dfs(i + 1 , _path + j)    
        
        
        if not digits:
            return []

        dic = { "2" : "abc", "3" : "def" , "4" : "ghi" , "5" : "jkl", 
                 "6" : "mno", "7" : "pqrs", "8" : "tuv"," 9" : "wxyz"
               }
        
        
        result = []     
        dfs(0,"")
        return result


        
        
        
        