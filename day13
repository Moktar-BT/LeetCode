class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int volume = 0;
        int left = 0;
        int right = n - 1;
        while (left < n && height[left] == 0) {
            left++;
        }
        while (right >= 0 && height[right] == 0) {
            right--;
        }

        while (left < right) {
            int minHeight = Math.min(height[left], height[right]);
            while (left < right && height[left] <=minHeight) {
                volume += Math.max(0, minHeight - height[left]);
                left++;
            }

            while (left < right && height[right] <=minHeight) {
                volume += Math.max(0, minHeight - height[right]);
                right--;
            }
        }
        return volume;
    }
}
