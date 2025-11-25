class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int [] freq = new int[101];
        for(int num: nums){
            freq[num]++;
        }

        for(int i =1; i<101; i++){
            freq[i] += freq[i-1];
        }

        int n = nums.length;
        int[] ans = new int[n];

        for(int i =0; i<n; i++){
            int val = nums[i];
            ans[i] = (val == 0)? 0: freq[val-1];
        }

        return ans;
    }
}