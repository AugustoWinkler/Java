class Solution {
    public int lengthOfLastWord(String s) {
        String[] palavra = s.strip().split(" ");
        return palavra[palavra.length - 1].length();
    }
}