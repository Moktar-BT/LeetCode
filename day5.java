class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int []output = new int[k];
        HashSet<Integer> HS = new HashSet<Integer>();
        for (int i = 0 ; i < nums.length;i++){
            HS.add(nums[i]);
        }
        HashMap <Integer,Integer> HM = new HashMap <Integer,Integer>();
        Iterator<Integer> it = HS.iterator();
        while (it.hasNext()){
            int occ = 0 ; 
            int current = it.next();
            for ( int i = 0 ; i < nums.length;i++){
                if(current==nums[i]){
                    occ++;
                }
            }
            HM.put(current ,occ);
        }
        for ( int i = 0 ; i<k ; i++){
            int max = 0 ;
            int max_key = 0 ; 
            
            for ( Integer j : HM.keySet()){
                if(max<HM.get(j)){
                    max=HM.get(j);
                    max_key= j;
                }
            }
            if(HM.containsKey(max_key)){
                output[i]=max_key;
                HM.remove(max_key);
            }
        }
        return output;  
    }
}