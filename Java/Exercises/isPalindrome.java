class Solution {
    public boolean isPalindrome(int x) {
        String numberX = Integer.toString(x);
        String reverseX = new StringBuilder(numberX).reverse().toString();

        return numberX.equals(reverseX);
    }
}