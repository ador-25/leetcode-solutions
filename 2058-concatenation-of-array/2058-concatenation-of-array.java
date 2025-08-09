class Solution {
    public int[] getConcatenation(int[] nums) {
        int initialLength = nums.length;
        int newLength = nums.length *2;
        int[]result = new int[newLength];
        for(int i=0;i<newLength;i++){
            int position = i<nums.length? i : i-initialLength;
            result[i] = nums[position];
        }
        return result;

    }
}