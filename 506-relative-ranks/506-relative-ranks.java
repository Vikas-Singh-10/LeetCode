class Solution {
    public String[] findRelativeRanks(int[] score) {
        int[] dp = score.clone();
        Arrays.sort(dp);
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = score.length-1; i >= 0; i--){
            arr.add(dp[i]);
        }
        Map<Integer,String> mp = new HashMap<>();
        for(int i = 0; i < arr.size(); i++){
            if(i == 0){
                 mp.put(arr.get(i),"Gold Medal");
            }
            if(i == 1){
                 mp.put(arr.get(i),"Silver Medal");
            }
            if(i == 2){
                 mp.put(arr.get(i), "Bronze Medal");
            }
            else if(i > 2){
                mp.put(arr.get(i),Integer.toString(i+1));
            }
        }
        String[] ar1 = new String[score.length];
        for(int i = 0; i < ar1.length; i++){
            ar1[i] = mp.get(score[i]);
        }
        return ar1;
    }
}