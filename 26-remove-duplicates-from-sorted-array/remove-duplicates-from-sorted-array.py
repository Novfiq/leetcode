class Solution(object):
    def removeDuplicates(self, nums):
        j=0
        for i in range(len(nums)-1):
            if nums[j]==nums[j+1]:
                nums.pop(j+1)
            else:
                j+=1
        return len(nums)
        