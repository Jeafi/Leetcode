class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums == null || nums.length == 0 )
        {
            return 0;
        }
        int left = 0;
        int right = nums.length -1;
        int mid = -1;
        while ( left <=right )
        {        
            if(nums[(left + right)/2] == target)
            {return (left + right)/2;}
            if(target <= nums[(left + right)/2])
            {right = (left + right)/2 - 1;}
            if(target > nums[(left + right)/2])
            {left = (left + right)/2 + 1;}
        }
    return left;
    }
    
}