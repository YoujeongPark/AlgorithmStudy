class Solution:
    def combine(self, n: int, k: int) -> List[List[int]]:
        
        tmp = list(map(lambda x : x, range(1, n+1)))
        
        def dfs(_numberList, _route):
            if len(_route) == k :
                result.append(_route)
                return;
            
            for i in range(0, n):
                if len(_route) > 0 :
                    if _route[-1] < _numberList[i] : 
                        dfs(_numberList, _route + [_numberList[i]]);               
                else:
                    dfs(_numberList, _route + [_numberList[i]]);      
        result = []; 
        dfs(tmp, [])
        return result;