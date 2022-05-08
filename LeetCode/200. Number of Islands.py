class Solution(object):
    def numIslands(self, grid):
        """
        :type grid: List[List[str]]
        :rtype: int
        """
        len_width = len(grid)
        len_height = len(grid[0])
        
        def dfs(i,j):
            if i < 0 or j < 0 or i > len_width -1 or j > len_height -1 or grid[i][j] != '1':
                return 
    
            grid[i][j]=0;
        
            dfs(i+1, j);
            dfs(i, j+1);
            dfs(i-1, j);
            dfs(i,j-1);
        
        count = 0
        for i in range(0,len(grid)):
            for j in range(0,len(grid[0])):
                if grid[i][j] == '1':
                    dfs(i,j)
                    count+=1
        
        return count