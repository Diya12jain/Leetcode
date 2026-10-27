class Solution {
    public String[] createGrid(int m, int n) {
        String[] ans=new String[m];
       char[][] grid=new char[m][n];
        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){
                grid[i][j]='#';
            }
        }
        for(int i=0 ; i<m ; i++){
            grid[i][0]='.';
        }
        for(int i=0 ; i<n ; i++){
            grid[m-1][i]='.';
        }
        // for(int i=0 ; i<m ; i++){
        //     ans[i]=String.valueOf(grid[i]);  // ans[i]=new String(grid[i]);
        // }

        for(int i=0 ; i<m ; i++){
            StringBuilder s=new StringBuilder();
            for(int j=0 ; j<n ; j++){
                s.append(grid[i][j]);
            }
            ans[i]=s.toString();
        }
        return ans;
    }
}