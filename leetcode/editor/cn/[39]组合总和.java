class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subRes = new ArrayList<>();
        Arrays.sort(candidates);
        find(res,subRes,candidates,target,0);
        return res;
    }
    public void find(List<List<Integer>> res, List<Integer> subRes, int[] candidates, int target, int index){
        if(target==0){
            res.add(new ArrayList<>(subRes));//要使用new ArrayList<>(subRes)，不然就是淺拷貝！！！！！
        }
        for (int i = index; i < candidates.length; i++) {
            if(candidates[i] > target){
                break;
            }
            subRes.add(candidates[i]);
            find(res,subRes,candidates,target-candidates[i],i);
            subRes.remove(subRes.size()-1);//不斷地把最後一個剪掉，來尋找下一個可能
        }
    }
}
