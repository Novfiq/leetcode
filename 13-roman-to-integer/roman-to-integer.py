class Solution(object):
    def romanToInt(self, s):
        a = {"I":1, "V":5, "X":10, "L":50, "C":100, "D":500, "M":1000}
        sum = 0     
        for i in range(len(s)):
            if i + 1 < len(s) and a[s[i]] < a[s[i+1]]:
                sum -= a[s[i]]
            else:
                sum += a[s[i]]
        return sum
