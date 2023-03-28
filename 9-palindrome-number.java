class Solution {
    public boolean isPalindrome(int x) {
        int num = x;
        int temp = 0;
        int digit;
        while (x>0) {
            digit = x%10;
            temp = temp*10 + digit;
            x = x/10;
        }
        if (num == temp)
            return true;
        else
            return false;
    }
}