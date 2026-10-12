class Solution {
    public int alternatingSubarray(int[] nums) {
        int ans=-1;
        for(int i=0 ; i<nums.length ; i++){
            for(int j=i+1 ; j<nums.length ; j++){
                int d=nums[j]-nums[j-1];
                if((j-i)%2==1){
                    if(d!=1) break;
                }
                else{
                    if(d!=-1) break;
                }
                ans=Math.max(ans,j-i+1);
            }
        }
        return ans;
    }
}