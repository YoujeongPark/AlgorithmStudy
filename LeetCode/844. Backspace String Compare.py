class Solution:
    def backspaceCompare(self, s: str, t: str) -> bool:
        _s = list(s)
        _t = list(t)   
        result1 = []
        for __s in _s:
            if __s != '#':
                result1.append(__s)
            elif len(result1) > 0 :
                result1.pop();
        
        result2 = []
        for __t in _t:
            if __t != '#':
                result2.append(__t)
            elif len(result2) > 0 :
                result2.pop();
                
        return result1 == result2