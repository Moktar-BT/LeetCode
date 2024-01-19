class Solution {
    public boolean isPalindrome(String s) {
        String chaine = s.toLowerCase().replaceAll("[^a-z0-9]", ""); // Remove non-alphanumeric characters

        int pointer1 = 0;
        int pointer2 = chaine.length() - 1; // Adjust the end pointer

        while (pointer1 < pointer2) { // Fix the loop condition
            if (chaine.charAt(pointer1) == chaine.charAt(pointer2)) {
                pointer1++;
                pointer2--;
            } else {
                return false;
            }
        }

        return true;
    }
}
