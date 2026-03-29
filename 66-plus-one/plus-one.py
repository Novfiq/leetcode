class Solution(object):
    def plusOne(self, digits):
        s = ""
        for i in digits:
            s += str(i)      
        nums = int(s) + 1
        s = str(nums)
        del digits[:]
        for i in s:
            digits.append(int(i))
            
        return digits

        