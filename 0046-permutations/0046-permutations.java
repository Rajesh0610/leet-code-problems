class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        bt(nums, new ArrayList<>(), ans);
        return ans;
    }
    private void bt(int[] nums, List<Integer> curr, List<List<Integer>> ans) {
        if (curr.size() == nums.length) {
            ans.add(new ArrayList<>(curr));
            return;
        }
        for (int num : nums) {

            if (curr.contains(num))
                continue;
            curr.add(num);
            bt(nums, curr, ans);
            curr.remove(curr.size() - 1);
        }
    }
}