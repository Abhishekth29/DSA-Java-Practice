class Solution {
    public int singleNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            boolean isunq = true;

            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j]) {
                    isunq = false;
                    break;
                }
            }

            if (isunq) {
                return nums[i];
            }
        }
        return -1;
    }
}
