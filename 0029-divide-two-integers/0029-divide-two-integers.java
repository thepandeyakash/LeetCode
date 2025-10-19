class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == divisor) return 1;
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;


        boolean sign = (dividend < 0) ^ (divisor < 0);

        long n = Math.abs((long)dividend);
        long d = Math.abs((long)divisor);
        long q = 0;

        while(n >= d){
            int cnt = 0;
            while(n >= (d << (cnt+1))){
                cnt += 1;
            }
            q += 1 << cnt;
            n -= (d << cnt);
        
        }

        if (q > Integer.MAX_VALUE)
            return sign ? Integer.MAX_VALUE : Integer.MIN_VALUE;


        return (!sign? (int)q : -(int)q);


    }
}