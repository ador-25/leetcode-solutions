class Solution {

    public int removeElement(int[] nums, int val) {
        int front = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                int temp = nums[front];
                nums[front] = nums[i];
                nums[i] = temp;
                front++;
            }
        }
        return front;
    }


}