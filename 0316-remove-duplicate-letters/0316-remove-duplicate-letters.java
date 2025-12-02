class Solution {
    public String removeDuplicateLetters(String s) {
        int n = s.length();
        int[] lastIndex = new int[26];
        boolean[] inStack = new boolean[26];

        for(int i =0; i<n; i++){
            char ch = s.charAt(i);
            lastIndex[ch - 'a'] =i;
        }

        StringBuilder stack = new StringBuilder();

        for(int i =0; i<n; i++){
            char ch = s.charAt(i);
            int idx = ch - 'a';

            if(inStack[idx]) continue;

            while(stack.length() > 0 && ch < stack.charAt(stack.length()-1) && lastIndex[stack.charAt(stack.length() - 1) - 'a'] > i){

                char removed = stack.charAt(stack.length() - 1);
                inStack[removed - 'a'] = false;
                stack.deleteCharAt(stack.length() - 1);
            }

            stack.append(ch);
            inStack[idx] = true;
        }

        return stack.toString();
    }
}