class Solution:
    def maxArea(self, height: list[int]) -> int:
        max=0
        l=0
        r=len(height)-1
        while l<r:
            width=r-l
            curr_water = min(height[l],height[r])*width
            if curr_water>max:
                max=curr_water
            if height[l]<height[r]:
                l+=1
            else:
                r-=1
        return max