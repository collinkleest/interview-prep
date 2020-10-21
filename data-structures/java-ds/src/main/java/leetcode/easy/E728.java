package leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class E728 {

    public static List<Integer> selfDividingNumbers(int left, int right){
        List<Integer> ans = new ArrayList<>();
        while(left <= right){
            if (checkNumber(left)){
                ans.add(left);
            }
            left ++;
        }
        return ans;
    }

    public static boolean checkNumber(int i){
        while (i != 0){
            int x = i % 10;
            if (x == 0){
                return false;
            }
            if (i % x != 0){
                return false;
            }
            i = i / 10;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(selfDividingNumbers(2, 22));
    }

}
