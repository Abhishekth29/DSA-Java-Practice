class Solution {
    public int missingNumber(int[] nums) {
        int actualsum=0;
        for(int num: nums){
            actualsum+=num;
        }
        return (nums.length*(nums.length+1)/2) - actualsum;
    }
}
