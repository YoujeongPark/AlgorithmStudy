class Solution:
    def romanToInt(self, s: str) -> int:
        symbolDic = {
            'I': 1, 
            'V': 5, 
            'X': 10,
            'L': 50,
            'C': 100,
            'D': 500,
            'M': 1000,
        }
        
        prev = 0; 
        cur = 0;
        sum = 0; 
        
        romNewList = [];
        romList = list(s)
        i = 0; 
            
        romList = list(s)
        while True:
            if i+1 < len(romList) and symbolDic[romList[i]] < symbolDic[romList[i+1]] :
                    sum += (symbolDic[romList[i+1]] - symbolDic[romList[i]])
                    i = i+2; 
            else:
                sum += symbolDic[romList[i]]
                i = i+1; 
            
            if len(romList) <= i:
                break; 
            
        return sum; 
        