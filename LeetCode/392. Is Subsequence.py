class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        if len(s) == 0:
            return True;
        if len(t) == 0:
            return False;

        if len(s) > len(t):
            s,t = t,s;
    
        index = len(s)-1;
        for item in reversed(t):
            if len(s) == 0:
                return True; 
            if s[index] == item:
                s = s[:index]
                index -= 1; 
                print(s)
        
        if len(s) == 0:
            return True;
        else:
            return False;
