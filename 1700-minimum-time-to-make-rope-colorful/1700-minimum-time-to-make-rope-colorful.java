class Solution {
    public int minCost(String colors, int[] neededTime) {
        int sum = 0;
        int max = neededTime[0];
        for(int i = 0; i< colors.length() -1 ; i++){
            
            if(colors.charAt(i) == colors.charAt(i+1)){
                if(neededTime[i+1] > max){
                   
                    sum += max;
                    max = neededTime[i+1];
                }
                else{
                    sum += neededTime[i+1];
                }
                
            }
            else {
                max = neededTime[i+1];
            }
        }

        return sum;
    }
}