class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        if(nums[0] != nums[1]){
            return nums[0];
        }
        if(nums[nums.length-1] != nums[nums.length-2]){
            return nums[nums.length-1];
        }
        int strt = 0;
        int end = nums.length-1;
        while(strt <= end){
            int mid = strt + (end - strt) / 2;
            if((nums[mid] != nums[mid+1]) && (nums[mid] != nums[mid-1])){
                return nums[mid];
            }
            if(((mid%2 == 0 )&& (nums[mid] == nums[mid+1])) || ((mid%2 != 0) && (nums[mid] == nums[mid-1]))){
                strt = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
}