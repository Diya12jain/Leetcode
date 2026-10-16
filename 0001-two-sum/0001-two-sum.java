class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] ans=new int[2];
        // map.put(0,-1);
        for(int i=0 ; i<nums.length ; i++){
            map.put(nums[i],i);
        }
        for(int i=0 ; i<nums.length ; i++){
            int need=target-nums[i];
            if(map.containsKey(need) && map.get(need)!=i){
                ans[0]=map.get(need);
                ans[1]=i;
            }
            if(ans[0]!=0 || ans[1]!=0) 
                break;
        }
        return ans;
    }
}