public class Solution {
    public int[] TwoSum(int[] nums, int target) {
        var dict = new Dictionary<int, int>();
        for (int i = 0; i < nums.Length;  i++) {
		    int rest = target - nums[i];
            if (dict.ContainsKey(rest)){
                return new int[2] {dict[rest], i};
			}
            dict[nums[i]] = i;
        }
        throw new ArgumentException("Not found");
    }
}