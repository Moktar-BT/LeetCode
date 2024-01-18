class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[]res = new int [nums.length];
        int prefixe=1;
        for (int i = 0 ; i < nums.length ; i++){
            res[i]=prefixe;
            prefixe*=nums[i];
        }
        int postfixe=1;
        for (int i = nums.length-1 ; i>=0;i--){
            res[i]*=postfixe;
            postfixe*=nums[i];
        }
   
        return res; 
    }
}