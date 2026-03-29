class Solution {
    public String longestCommonPrefix(String[] strs) {  
        int i,j;
        String ans = "";  
        for(i=0;i<strs[0].length();i++)
        {
            char c=strs[0].charAt(i);     
            for(j=1;j<strs.length;j++)
            {
                if(i>=strs[j].length()||strs[j].charAt(i)!=c)
                {
                    return ans;
                }
            }      
            ans=ans+c;
        } 
        return ans;
    }
}