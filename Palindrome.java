class Solution {
    public boolean isPalindrome(int x) {
        x.checkNums;
    }

    public boolean checkNums(int num) {
        char[] numChar = ("" + num).toCharArray();
        int start = 0;
        int end = numChar.length - 1;
        while(numChar[start] <= numChar[end]) {
            if (numChar[start] == numChar[end]) {
                return true;
            }
            start++;
            end--;
        }
        return false;
    }
}