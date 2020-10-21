package leetcode.easy.strings;

/*
    @author collin kleest
    @problem to lower case, 709
    @link https://leetcode.com/problems/to-lower-case/
 */

public class E709 {

    public static String toLowerCase(String str) {
        StringBuilder sb = new StringBuilder();
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++){
            char c = chars[i];
            int n = (int)c;
            if (n >= (int)'A' && n <= (int)'Z'){
                n += 32;
            }
            sb.append((char)n);
        }
        return sb.toString();
    }

}
