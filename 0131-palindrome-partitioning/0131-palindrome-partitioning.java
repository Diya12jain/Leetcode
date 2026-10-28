class Solution {
    public List<List<String>> partition(String ques) {
        List<List<String>> ans=new ArrayList<>();
        List<String> l=new ArrayList<>();
        Partitioning(ques,l,ans);
        return ans;
    }
    public static void Partitioning(String ques,List<String> l,List<List<String>> ans){
        if(ques.length()==0){
            ans.add(new ArrayList<>(l));
            return;
        }
        for(int cut=1 ; cut<=ques.length() ; cut++){
            String s=ques.substring(0,cut);
            if(isPalindrome(s)){
                l.add(s);
                Partitioning(ques.substring(cut),l,ans);
                l.remove(l.size()-1);
            }
        }
    }
    public static boolean isPalindrome(String s){
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}