class Solution {
    public int[] replaceElements(int[] arr) {
        int[]result = new int[arr.length];
        int i = arr.length-2;
        int max = arr[arr.length-1];
        result[arr.length-1]= -1;
        
        
        for (;i>=0;i--){
            result[i] = max;
            max = Math.max(max,arr[i]);
        }
        return result;

    }
}