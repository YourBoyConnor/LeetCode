class Solution {
    public int pivotIndex(int[] nums) {
        int pivotIndex = -1;

        for (int i = 0; pivotIndex == -1 && i < nums.length; i++) {
            int leftSum = 0, rightSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += nums[j];
            }
            for (int j = nums.length - 1; j > i; j--) {
                rightSum += nums[j];
            }

            if (leftSum == rightSum) {
                pivotIndex = i;
            }
        }

        return pivotIndex;
    }
}