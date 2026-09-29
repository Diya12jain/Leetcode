class Solution {
    public String convertToBase7(int num) {
        if(num==0){
            return "0";
        }
        boolean neg=false;
        if(num<0) {
            neg=true;
            num=-num;
        }
        String s="";
        while(num>0) {
            int rem=num%7;
            s=rem+s;
            num=num/7;
        }
        if(neg) {
            s="-"+s;
        }
        return s;
    }
}