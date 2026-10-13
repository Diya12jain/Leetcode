class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] ss=s.split(" +");
        if(ss.length!=pattern.length()) return false;
        for(int i=0 ; i<pattern.length() ; i++){
            for(int j=i+1 ; j<pattern.length() ; j++){
                if(ss[i].equals(ss[j])){
                    if(pattern.charAt(i)!=pattern.charAt(j)){
                        return false;
                    }
                }
                if(pattern.charAt(i)==pattern.charAt(j)){
                    if(!ss[i].equals(ss[j])){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}