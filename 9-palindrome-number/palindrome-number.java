class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        {
            return false;
        }
        int y=x;
        int rem,sum=0;
        while(y>0)
        {
            rem=y%10;
            sum=(sum*10)+rem;
            y=y/10;
        }
        if(sum==x)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}