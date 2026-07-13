class Solution {
    public boolean consecutiveSetBits(int n) {
        int pairCount = 0;
        for(int i = 0; i<32; i++){
            if((n&3) == 3){
                pairCount++;
            }
            n >>= 1;
        }
        return pairCount == 1;
    }
}