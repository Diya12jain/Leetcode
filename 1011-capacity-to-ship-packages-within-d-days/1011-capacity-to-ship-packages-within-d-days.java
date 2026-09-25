class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int lo=0;
        int hi=0;
        for(int i=0 ; i<weights.length ; i++){
            lo=Math.max(lo,weights[i]); //not smallest , bcz. if min el is capacity then it can't hold max el.
            hi+=weights[i];
        }
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            int day=capacity(weights,mid);
            if(day<=days){
                hi=mid-1;
            }
            else lo=mid+1;
        }
        return lo;
    }
        public static int capacity(int[] weights, int mid){
            int day=1;
            int s=0;
            for(int i=0 ; i<weights.length ; i++){
                if(mid>=s+weights[i]){
                    s+=weights[i];
                }
                else{
                    day++;
                    s=weights[i];
                }
            }
            return day;
        }
}