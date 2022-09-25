class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = {-1,-1};
        arr[0] = SearchIndex(nums,target,true);
        arr[1] = SearchIndex(nums,target,false);
        return arr;
    }
    int SearchIndex(int[] nums,int target,boolean isFirst){
        int ans = -1;
        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            int mid = start+(end-start)/2;
            if(nums[mid] < target){
                start = mid+1;
            }
            else if(nums[mid] > target){
                end = mid-1;
            }
            else{
                ans = mid;
                if(isFirst){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return ans;
    }
}