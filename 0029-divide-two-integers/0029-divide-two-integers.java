class Solution {
    public int divide(int dividend, int divisor) 
    {
        if(dividend==Integer.MIN_VALUE && divisor==-1)
        {
            return Integer.MAX_VALUE;
        }
       boolean negative =(dividend<0)^(divisor<0);

       long ldividend = Math.abs((long)dividend);
       long ldivisor = Math.abs((long)divisor);
       long quotient = 0;

       while(ldividend >= ldivisor)
       {
        long tempdivisor = ldivisor;
        long multiple = 1;
        while((tempdivisor<<1)<=ldividend)
        {
            tempdivisor <<= 1;
            multiple <<=1;
        }
        ldividend -= tempdivisor;
        quotient += multiple;
       }

       return negative ? (int)-quotient : (int) quotient;
    
    }
}