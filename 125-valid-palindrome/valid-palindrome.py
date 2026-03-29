class Solution(object):
    def isPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        s=s.lower()
        a=s
        clean1=re.sub(r'[^a-zA-Z0-9]', '', s).lower()
        if s==" ":
            return True
        clean = re.sub(r'[^a-zA-Z0-9]', '', s).lower()
        clean=clean[::-1]
        if clean==clean1:
            return True
        else:
            return False