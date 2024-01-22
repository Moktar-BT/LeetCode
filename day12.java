lass Solution {
    public int maxArea(int[] height) {
        int max = 0 ; 
        for (int i = 0 ; i <height.length - 1 ; i++){
            for (int j = i + 1 ; i < height.length ; j++){
                int min = 0;
                if (height[i]>height[j]){
                    min = height[j];
                }
                else{
                    min=height[i];
                    }
                int v = min * (j-i);
                if (max<v){
                    max= v;
                }    
            }
        }
        return max;
    }
}