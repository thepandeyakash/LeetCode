class Solution {
    public int[] findErrorNums(int[] nums) {
        int dup = -1, missing = -1;
        int n = nums.length;

        for(int num: nums){
            int idx = Math.abs(num) - 1;
            if(nums[idx] < 0){
                dup = Math.abs(num);
            }else {
                nums[idx] *= -1;
            }
        }

        for(int i = 0; i<n; i++){
            if(nums[i]>0){
                missing = i+1;
                break;
            }
        }

        return new int[]{dup, missing};
    }
}