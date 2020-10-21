package leetcode.hard;

/*
    @author collin kleest
    @problem candy 135
    @link https://leetcode.com/problems/candy/
 */

import java.util.Arrays;

public class E135 {

    public static int candy(int[] ratings) {
        int sum = 0;
        int[] left2right = new int[ratings.length];
        int[] right2left = new int[ratings.length];
        Arrays.fill(left2right, 1);
        Arrays.fill(right2left, 1);

        for (int i = 1; i < ratings.length; i++){
            if (ratings[i] > ratings[i-1]){
                left2right[i] = left2right[i-1] + 1;
            }
        }

        for (int j = ratings.length - 2; j >= 0; j--){
            if (ratings[j] > ratings[j + 1]){
                right2left[j] = right2left[j + 1] + 1;
            }
        }

        for (int i = 0; i < ratings.length; i++){
            sum += Math.max(left2right[i], right2left[i]);
        }

        return sum;
    }

}
