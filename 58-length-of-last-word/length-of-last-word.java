class Solution {
    public int lengthOfLastWord(String s) {
        int i,count=0;
        for(i=s.length()-1;i>=0;i--)
        {
            if(count==0 && s.charAt(i)==' ')
            {
                continue;
            }
            if(s.charAt(i)!=' ')
            {
                count++;
            }
            if(s.charAt(i)==' ')
            {
                return count;
            }
        }
        return count;
    }
}