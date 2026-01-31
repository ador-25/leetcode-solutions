class Solution { 
    private int[]cache;
    public int climbStairs(int n) {
        cache = new int[n+1];
        return climb(n);
    }

    private int climb(int n){
        if(n==1) return 1;
        if(n==2) return 2;
        if (cache[n]!=0) return cache[n];
        int l = climb(n-1);
        int r = climb(n-2);
        int result = l+r;
        cache[n]=result;
        return result;
    }
}