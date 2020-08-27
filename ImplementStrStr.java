/**
 * 28. Implement strStr()
 * Implement strStr().
 * 
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 * 
 * Example 1:
 * 
 * Input: haystack = "hello", needle = "ll"
 * Output: 2
 */

public class ImplementStrStr {
    public int strStr(String haystack, String needle) {
        int needleSize = needle.length();
        for(int i = 0; i <= haystack.length() - needleSize; i++) {
            if(needle.equals(haystack.substring(i, i + needleSize))) {
                return i;
            }
        }
        return -1;
    }
}