class Solution {
    public int[] twoSum(int[] nums, int target) {
         for(int i = 0;i < nums.length - 1;i++){
             int left = target - nums[i];
                 for(int j = i + 1; j < nums.length; j++){
                     if(left == nums[j]){
                         int[] as = {i,j};                        
                         return as;
                 }
             }
         }
        return null;
    }
}