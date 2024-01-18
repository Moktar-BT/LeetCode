class Solution {
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        for (int i = 0 ; i<s.length();i++){
            for (int j=0 ; j<t.length();j++){
                if (s.charAt(i) == t.charAt(j)){
                    t=t.substring(0,j)+t.substring(j+1);
                    break;
                }
            }
        }
        return t.equals("");
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> anaglists =new ArrayList<>();
        int [] index = new int[strs.length];
        for (int i =0 ; i < strs.length ; i++){
            index[i]=-1;
        }
        int l = 0;
        boolean t = true;
        for (int i = 0 ; i <strs.length;i++){
            List<String> anaglist = new ArrayList<>();
            for (int value : index) {
                if (i == value) {
                     t = false;
                     break;
                }
            }
            if (t == false){
                t = true;
                continue;
            }

            anaglist.add(strs[i]);

            for ( int j = i + 1; j < strs.length; j++ ){
                if (isAnagram(strs[i], strs[j])){
                    anaglist.add(strs[j]);
                    index[l]=j;
                    l++;
                }
            }
            anaglists.add(anaglist);
        }
        return anaglists;
    }
}