package leetcode.easy.strings;
/*
    @author collin kleest
    @problem reverse words in string III 557
    @link https://leetcode.com/problems/reverse-words-in-a-string-iii/
 */
public class E557 {

    public static String reverseWords(String s){
        String[] words = s.split(" ");
        StringBuilder ans = new StringBuilder();
        for (String word: words){
            ans.append(new StringBuffer(word).reverse().toString() + " ");
        }
        return ans.toString().trim();
    }


    public static void main(String[] args) {
        String testStr = "Let's take LeetCode contest";
        System.out.println(reverseWords(testStr));
    }
}
