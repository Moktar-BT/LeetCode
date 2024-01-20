class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int k = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > target && target >0) {
                k = i;
                break;
            }
            else{
                k=i;
            }
        }
        int pointer1 = 0;
        int pointer2 = k;
        while (pointer1 <= pointer2) {
            int[] resultat = new int[2];
            for (int j = pointer2; j >= pointer1+1; j--) {
                if ((numbers[pointer1] + numbers[j]) == target) {
                    resultat[0] = pointer1 + 1; 
                    resultat[1] = j + 1;
                    return resultat;
                }
            }
            pointer1++;
        }
        return null; 
    }
}
