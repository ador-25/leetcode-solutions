class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        boolean[] set = new boolean[256];
        for (int i =0;i<jewels.length();i++)
            set[jewels.charAt(i)] =true;
        int result = 0 ;
        for (int i =0;i<stones.length();i++)
            if (set[stones.charAt(i)])
                result++;
        return result;
    }
}