class Solution {
    public int longestOnes(int[] nums, int k) {
        int max = 0;
        int j = 0;
        int zeroCount = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 0 ){
                zeroCount++;
            }
            while(zeroCount > k){
                if(nums[j] == 0){
                    zeroCount--;
                }
                j++;
            }

            max = Math.max(max, i - j + 1);
            
              
        }
        return max;
    }
}