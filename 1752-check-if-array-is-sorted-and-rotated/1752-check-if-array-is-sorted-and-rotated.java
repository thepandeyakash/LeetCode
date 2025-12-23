class Solution {
    public boolean check(int[] nums) {
        int flag = 0;
        for(int i =0; i<nums.length-1; i++){
            if(nums[i] > nums[i+1]) flag++;
        }
        if(flag == 0) return true;
        if(flag == 1 && nums[0] >= nums[nums.length-1]){
            return true;
        }
        return false;
    }
}