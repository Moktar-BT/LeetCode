class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] resulat =new int [2];
        for(int i=0 ; i<nums.length ; i++){
            for(int j = 0 ; j<nums.length; j++){
                if (j==i){
                    continue;
                }
                else{
                     if (target == ((nums[i])+(nums[j]))){
                         resulat[0]=i;
                         resulat[1]=j;
                         return resulat;
                }
                }
            } 
        }  
        return resulat;
    }
}