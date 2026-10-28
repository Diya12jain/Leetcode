class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> l=new ArrayList<>();
        Combination(candidates,target,l,0,ans);
        return ans;
    }
    public static void Combination(int[] candidates,int target,List<Integer> l,int idx,List<List<Integer>> ans){
        if(target==0){
            ans.add(new ArrayList<>(l));
            return;
        }
        for(int i=idx ; i<candidates.length ; i++){
            if(candidates[i]<=target){
                l.add(candidates[i]);
                Combination(candidates,target-candidates[i],l,i,ans);
                l.remove(l.size()-1);
            }
        }
    }
}