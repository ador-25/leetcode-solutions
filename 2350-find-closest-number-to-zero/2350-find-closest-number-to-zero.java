class Solution {
       public int findClosestNumber(int[] nums) {
        int positiveMin = Integer.MAX_VALUE;

        int negativeMax = Integer.MIN_VALUE;
        int negativeCount = 0,positiveCount = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                return 0;
            }
            // calculate positive min
            if (nums[i]>0){
                positiveMin = Math.min(positiveMin,nums[i]);
                positiveCount++;
            }
            else{  // calculate negative max
                negativeMax = Math.max(negativeMax,nums[i]);
                negativeCount++;
            }
        }


        if (negativeCount == 0){
            return positiveMin;
        }
        if (positiveCount == 0){
            return negativeMax;
        }
        if (positiveMin != negativeMax){
            if (Math.abs(negativeMax)<positiveMin){
                return negativeMax;
            }
            return positiveMin;
        }
        return positiveMin;

    }
}