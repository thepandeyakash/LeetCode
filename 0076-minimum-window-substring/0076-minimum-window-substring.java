class Solution {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() < t.length()) {
            return "";
        }

        int[] targetCounts = new int[128];
        for (char c : t.toCharArray()) {
            targetCounts[c]++;
        }

        int[] windowCounts = new int[128];

        int left = 0;
        int minLen = Integer.MAX_VALUE;
        int minLeft = 0;

        int formed = 0;
        
        int required = 0;
        for (int count : targetCounts) {
            if (count > 0) required++;
        }

        for(int right = 0;right< s.length(); right++){
            char rightChar = s.charAt(right);
            windowCounts[rightChar]++;

            if(targetCounts[rightChar] > 0 && windowCounts[rightChar] == targetCounts[rightChar]){
                formed++;
            }

            while(formed == required){
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    minLeft = left;
                }

                char leftChar = s.charAt(left);

                if (targetCounts[leftChar] > 0 && windowCounts[leftChar] == targetCounts[leftChar]) {
                    formed--;
                }
                
                windowCounts[leftChar]--;
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(minLeft, minLeft + minLen);
    }
}