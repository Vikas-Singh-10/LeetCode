class Solution {
    public void sortColors(int[] nums) {
        int zero = 0;
        int two = nums.length-1;
        int index = 0;
        while(index <= two){
            if(nums[index] == 0){
                int temp = nums[zero];
                nums[zero] = nums[index];
                nums[index] = temp;
                zero++;
                index++;
            }
            else if(nums[index] == 1){
                index++;
            }
            else{
                int temp = nums[two];
                nums[two] = nums[index];
                nums[index] = temp;
                two--;
            }
        }
    }
}