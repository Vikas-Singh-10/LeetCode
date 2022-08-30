class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length == 1){
            return 0;
        }
        if(nums[0] > nums[1]){
            return 0;
        }
        if(nums.length == 2 && nums[1] > nums[0]){
            return 1;
        }
        if(nums[nums.length-1] > nums[nums.length-2]){
            return nums.length-1;
        }
        int start = 0;
        int num = 1;
        int end = 2;
        while(end <= nums.length-1){
            if(nums[num] > nums[start] && nums[num] > nums[end]){
                return num;
            }
            start++;
            num++;
            end++;
        } 
        return 0;
    }
}