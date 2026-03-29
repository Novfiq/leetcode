class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int []nums3=new int[n1+n2];
        int len=n1+n2;
        int mid=len/2;
        int k=0;
        int i=0;
        int j=0;
        int m=0;
        if(len%2==0)
        {
            while (k < len) 
            {
                if (i < n1 && (j >= n2 || nums1[i] <= nums2[j])) 
                {
                    nums3[k] = nums1[i++];
                } 
                else 
                {
                    nums3[k] = nums2[j++];
                }
                k++;
            }
        }
        else
        {
           while (k < len) 
           {
                if (i < n1 && (j >= n2 || nums1[i] <= nums2[j])) 
                {
                    nums3[k] = nums1[i++];
                }    
                else 
                {
                    nums3[k] = nums2[j++];
                }
                k++;
           } 
        }
        if (len % 2 == 0) 
        {
            return (nums3[mid - 1] + nums3[mid]) / 2.0;
        }   
        else 
        {
            return nums3[mid];
        }
    }
}