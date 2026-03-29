class Solution {
    public int reverse(int x) {
        if (x==Integer.MIN_VALUE) {
            return 0;
        }
        int y=x;
        int sum=0;
        int rem=0;
        if (y<0) {
            y=-y;
        }
        while(y!=0) {
            rem=y%10;
            if (sum>Integer.MAX_VALUE/10 || (sum==Integer.MAX_VALUE/10&&rem>7))
            {
                return 0;
            }
            sum=(sum*10)+rem;
            y=y/10;
        }
        if(x<0) {
            return -sum;
        }
        else 
        {
            return sum;
        }
    }
}