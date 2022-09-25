class Solution {
    public boolean isPalindrome(int x) {
        int palin = 0;
        for(int i = x; i > 0; i/=10){
            int n = i % 10;
            palin = (palin*10)+n;
        }
        if(palin == x){
            return true;
        }
        return false;
    }
}