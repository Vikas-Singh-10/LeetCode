class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char x = target;
        int start = 0;
        int end = letters.length-1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(letters[mid] > target){
                end = mid;
                x = letters[mid];
            }
            if(letters[mid] <= target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        if(x == target){
            return letters[0];
        }
        return x;
    }
}