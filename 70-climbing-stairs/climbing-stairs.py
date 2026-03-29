class Solution(object):
    def climbStairs(self, n):
        """
        :type n: int
        :rtype: int
        """
        a,b=1,2
        if n==1 or n==2:
            return n
        for _ in range(2,n):
            a,b=b,a+b
        return b
        