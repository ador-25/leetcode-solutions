public class Solution {
    private int []cache;
    public int ClimbStairs(int n)
    {
        cache = new int[n+1];
        return Climb(n);
    }

    private int Climb(int n)
    {
        if(n==1 || n==2)
            return n;
        if(cache[n]!=0)
            return cache[n];
        int left = Climb(n-1);
        int rigth = Climb(n-2);
        int sum = left+rigth;
        cache[n]=sum;
        return sum;
    }
}