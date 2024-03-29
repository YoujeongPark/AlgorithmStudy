class Solution:
    def findItinerary(self, tickets: List[List[str]]) -> List[str]:
        
        graph = collections.defaultdict(list);
        
        for a,b in tickets:
            graph[a].append(b)
        
        route = [];
        stack = ['JFK']
        
        while stack:
            while graph[stack[-1]]:
                stack.append(graph[stack[-1]].pop(0))

            route.append(stack.pop(0))
        
        return route