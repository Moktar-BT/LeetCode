public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                // Skip duplicates for i
                continue;
            }

            int pointer_j = i + 1;
            int pointer_k = nums.length - 1;

            while (pointer_j < pointer_k) {
                int sum = nums[i] + nums[pointer_j] + nums[pointer_k];

                if (sum == 0) {
                    List<Integer> triplet = Arrays.asList(nums[i], nums[pointer_j], nums[pointer_k]);
                    result.add(triplet);

                    // Skip duplicates for pointer_j
                    while (pointer_j < pointer_k && nums[pointer_j] == nums[pointer_j + 1]) {
                        pointer_j++;
                    }

                    // Skip duplicates for pointer_k
                    while (pointer_j < pointer_k && nums[pointer_k] == nums[pointer_k - 1]) {
                        pointer_k--;
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