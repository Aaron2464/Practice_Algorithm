/** 
 * Determine whether an integer is a palindrome.
 * An integer is a palindrome when it reads the same backward as forward.
 * Example 1: Input: 121 / Output: true
 * Example 2: Input: -121 / Output: false
 * Example 3: Input: 10 / Output: false
 * Follow up: Coud you solve it without converting the integer to a string?
 */

public class isPalindrome {
    public boolean isPalindrome(int x) {
        if(x < 0 || (x % 10 == 0 && x != 0)) return false;
        int revNum = 0;
        while(x > revNum){
            revNum = revNum * 10 + x % 10;
            x = x / 10;
        }
        return x == revNum || x == revNum/10;
    }
}