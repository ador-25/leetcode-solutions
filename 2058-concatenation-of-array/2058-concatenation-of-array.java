class Solution {
    public int[] getConcatenation(int[] nums) {
        int i =0,n=nums.length;
        int[]result = new int[n*2];
        for(i=0;i<n;i++){
            result[i] = nums[i];
        }
        for(;i<result.length;i++){
            result[i] = nums[i-n];
        }
        return result;

    }
}