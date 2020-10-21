package leetcode.easy.strings;

import java.util.Arrays;

/*
    @author collin  kleest
    @problem reverse string 344
    @link https://leetcode.com/problems/reverse-string/
 */
public class E344 {

    public static void reverseStringEasy(char[] s){
        System.out.println(String.format("Input String: %s", Arrays.toString(s)));
        char[] ans = new char[s.length];
        int i = s.length - 1;
        int t = 0;
        while (i >= 0){
            ans[t++] = s[i];
            i--;
        }
        System.out.println(String.format("Output String: %s", Arrays.toString(ans)));
    }

    public static void reverseString(char[] s){
        System.out.println(String.format("Input String: %s", Arrays.toString(s)));
        int left_pointer = 0, right_pointer = s.length - 1;
        while (left_pointer < right_pointer){
            char tmp = s[left_pointer];
            s[left_pointer] = s[right_pointer];
            s[right_pointer] = tmp;
            left_pointer++;
            right_pointer--;
        }
        System.out.println(String.format("Output String: %s", Arrays.toString(s)));
    }

    public static void main(String[] args) {
        char[] myString = {'h', 'e', 'l', 'l', 'o'};
        reverseStringEasy(myString);
        reverseString(myString);
    }
}
