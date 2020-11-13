package leetcode.medium;

import java.util.*;

/*
    @author collin kleest
    @problem group anagrams
    @link https://leetcode.com/problems/group-anagrams/
 */
public class M49 {

    public static void main(String[] args) {
        String[] testInput = new String[]{"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(testInput));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> finalAnswer = new ArrayList<>();
        Map<String, List<String>> anagrams = new HashMap<>();

        for (String word : strs){
            String sortedWord = sortStr(word);
            if (anagrams.get(sortedWord) == null){
                List<String> tempList = new ArrayList<>();
                tempList.add(word);
                anagrams.put(sortedWord, tempList);
            } else {
                anagrams.get(sortedWord).add(word);
            }
        }

        for (List<String> groupedAnagrams : anagrams.values()){
            finalAnswer.add(groupedAnagrams);
        }

        return finalAnswer;
    }

    public static String sortStr(String s){
        char[] tempArray = s.toCharArray();
        Arrays.sort(tempArray);
        return Arrays.toString(tempArray);
    }

}
