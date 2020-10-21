package leetcode.easy;

/*
    @author collin kleest
    @problem lemonade change 860
    @link https://leetcode.com/problems/lemonade-change/
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class E860 {

    public static boolean lemonadeChange(int[] bills){
        int fives = 0, tens = 0;
        for (int i = 0; i < bills.length; i++){
            if (bills[i] == 5){
                fives++;
            } else if (bills[i] == 10){
                if (fives == 0) return false;
                fives--;
                tens++;
            } else {
                if (fives > 0 && tens > 0){
                    tens--;
                    fives--;
                } else if (fives >= 3){
                    fives -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        List<Integer> requests = new ArrayList<>();
        requests.add(null);
        System.out.println(requests.get(requests.size() - 1));
    }

}
