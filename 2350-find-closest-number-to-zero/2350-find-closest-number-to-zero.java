class Solution {
    public int findClosestNumber(int[] nums) {
        int min = Math.abs(nums[0]);
        int result = nums[0];
        for (int i=1;i<nums.length;i++){
            if (Math.abs(min)>=Math.abs(nums[i])){
                min = nums[i];
                if (Math.abs(min)== Math.abs(result)){
                    result =Math.max(result,min);
                    continue;
                }
                result = min;
            }
        }
        return result;
    }
}