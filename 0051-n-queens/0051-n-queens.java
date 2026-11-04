class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans=new ArrayList<>();
        char[][] board=new char[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = '.';
            }
        }
        Queen(board,n,0,ans);
        return ans;
    }
    public static void Queen(char[][] board,int n,int row,List<List<String>> ans){
        if(n==row){
            Display(board,ans);
            return;
        }
        for(int col=0 ; col<board[0].length ; col++){
            if(issafe(board,row,col)){
                board[row][col]='Q';
                Queen(board,n,row+1,ans);
                board[row][col]='.';
            }
        }
    }
    private static boolean issafe(char[][] board,int row,int col){
        //up
        int r=row;
        while(r>=0){
            if(board[r][col]=='Q'){
                return false;
            }
            r--;
        }
        //ld
        r=row;
        int c=col;
        while(r>=0 && c>=0){
            if(board[r][c]=='Q'){
                return false;
            }
            r--;
            c--;
        }
        //rd
        r=row;
        c=col;
        while(r>=0 && c<board[0].length){
            if(board[r][c]=='Q'){
                return false;
            }
            r--;
            c++;
        }
        return true;
    }
    public static void Display(char[][] board,List<List<String>> ans) {
        List<String> l = new ArrayList<>();
        for(int i=0 ; i<board.length ; i++){
            String s="";
            for(int j=0 ; j<board[i].length ; j++){
                s=s+board[i][j];
            }
            l.add(s);
        }
        ans.add(l);
    }
}