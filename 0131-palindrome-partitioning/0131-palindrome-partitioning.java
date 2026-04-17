class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        solve(s, new ArrayList<>(), res, 0);
        return res;
    }
    public void solve(String s,List<String> curr, List<List<String>> res, int index ){
        if(index == s.length()){
            res.add(new ArrayList<>(curr));
            return;
        }

        for(int i = index; i<s.length(); i++){
            if(!palindrome(s,index, i)){
                continue;
            }

            curr.add(s.substring(index, i+1));
            solve(s, curr, res, i+1);
            curr.remove(curr.size() - 1);
        }

    }
    public boolean palindrome(String s, int left, int right){
        while(left<right){
            if(s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;

    }
}