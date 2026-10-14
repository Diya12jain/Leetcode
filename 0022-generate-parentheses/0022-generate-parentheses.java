class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ls=new ArrayList();
        Parantheses(n,0,0,"",ls);
        return ls;
    }
    public void Parantheses(int n,int open,int closed,String ans,List<String> ls){
        if(open==n && closed==n){
            ls.add(ans);
            return;
        }
        if(open>n || closed>open){
            return;
        }
        Parantheses(n,open+1,closed,ans+"(",ls);
        Parantheses(n,open,closed+1,ans+")",ls);
    }
}