class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        if(arr[0] > arr[1]){
            return 0;
        }
        if(arr[arr.length-1] > arr[arr.length-2]){
            return arr.length-1;
        }
        int start = 0;
        int num = 1;
        int end = 2;
        while(end <= arr.length-1){
            if(arr[num] > arr[start] && arr[num] > arr[end]){
                return num;
            }
            start++;
            num++;
            end++;
        }
        return -1;
    }
}