class Solution(object):
    def strStr(self, haystack, needle):
        """
        :type haystack: str
        :type needle: str
        :rtype: int
        """
        if needle in haystack:
            for i in range(len(haystack)):
                if haystack[i:i + len(needle)] == needle:
                    return i
                else:
                    continue
        else:
            return -1
        