class Solution {
    public int maxDepth(String s) {
        
        int maxCount = 0;
        int count = 0;
        for(char c: s.toCharArray()){
            if(c == '('){
                count++;
                if(count>0) maxCount = Math.max(count, maxCount);
            }
            else if (c== ')'){
                count--;
                if(count<0) return -1;
            }

        }
        return count==0?maxCount: -1;
    }
}