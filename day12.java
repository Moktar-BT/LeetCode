class Solution {
    public int maxArea(int[] height) {
        int max = 0 ; 
        int p1 = 0 , p2= height.length - 1 ;
        while(p1<p2){
            int min = height[p1]; 
            if(height[p1]>height[p2]){
                min = height[p2];
            }
            int volume= min *(p2-p1);
            if (max<volume){
                max=volume;
            }
            if(height[p1]>height[p2]){
                p2--;
            }
            else{
                p1++;
            }
            
        }   
        return max;
    }
}