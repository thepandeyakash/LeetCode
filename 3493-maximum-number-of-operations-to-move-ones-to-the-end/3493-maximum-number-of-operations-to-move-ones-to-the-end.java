class Solution {
    public int maxOperations(String s) {
        int onesCount = 0;
        int ans = 0;
        for(int i =0; i< s.length(); i++){
            if(s.charAt(i) == '1') onesCount++;
            else if(i>0 && s.charAt(i-1) == '1') ans += onesCount; 
        }

        return ans;
    }
}
