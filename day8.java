/*

my first try :
class Solution {
    public static boolean exist1(int[] tab){
        for (int i = 0 ; i < tab.length ; i++){
            if (tab[i]==1){
                return true;
            }      
        }
        return false;
    }
    public int longestConsecutive(int[] nums) {
        int maxCes=1;
        int k =nums.length ;
        for (int i = 0 ; i < nums.length ; i++){
            boolean test = true;
            int current = nums[i];
            int[]tab=new int[k];
            for(int l = 0 ; l<nums.length; l++){
                tab[l]=nums[l]-current;
            }
            while (test){
                int ces =1;
                for (int j=0 ; j<k;j++){
                    tab[j]-=1;
                }    
                    if (exist1(tab)){
                        ces++;
                        test=true;
                    }
                    else{
                        test=false;
                    }              
                if (maxCes<ces){
                    maxCes=ces;
                }
            }
        }
        return maxCes; 
        }
    }
    */

// second try :
class Solution {
    private int maxCes;

    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();

        for (int num : nums) {
            hs.add(num);
        }

        maxCes = 0;

        for (int num : nums) {
            if (!hs.contains(num - 1)) {
                int length = 1;
                while (hs.contains(num + length)) {
                    length++;
                }
                maxCes = Math.max(maxCes, length);
            }
        }

        return maxCes;
    }
}


