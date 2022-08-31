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
        int end = nums.length-1;
        while(start < end){
            int mid = start + ( end - start ) / 2;
            if(nums[mid] < nums[mid+1]){
                start = mid + 1;
            }
            else{
                end = mid;
            }
        } 
        return start;
    }
}