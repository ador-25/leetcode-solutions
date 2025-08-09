class Solution {
    public int scoreOfString(String s) {
        int sum =0;
        int prev = s.charAt(0);

        for (int i =1;i<s.length();i++){
            int curr = s.charAt(i);
            int abs = Math.abs(curr-prev);
            sum += abs;
            prev = s.charAt(i);
        }
        return sum;
    }
}