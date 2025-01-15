class Solution {
    public int[] getConcatenation(int[] nums) {
        int offset = nums.length;
        int[]arr = new int[offset*2];
        for(int i=0;i<nums.length;i++){
            arr[i] = nums[i];
            arr[i+offset] = nums[i];
        }
        return arr;
    }
}