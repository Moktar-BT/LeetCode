public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            int pointer_j = i + 1;
            int pointer_k = nums.length - 1;

            while (pointer_j < pointer_k) {
                int sum = nums[i] + nums[pointer_j] + nums[pointer_k];

                if (sum == 0) {
                    List<Integer> triplet = Arrays.asList(nums[i], nums[pointer_j], nums[pointer_k]);
                    int hash = nums[i] * 100 + nums[pointer_j] * 10 + nums[pointer_k];

                    if (!seen.contains(hash)) {
                        result.add(triplet);
                        seen.add(hash);
                    }

                    pointer_j++;
                    pointer_k--;
                } else if (sum < 0) {
                    pointer_j++;
                } else {
                    pointer_k--;
                }
            }
        }

        return result;
    }
}
