package leetcode.easy;

import java.util.Arrays;

public class E905 {

    /*
        Two pass approach
        O(N) time and space complexity
     */
    public static int[] sortArrayByParityTwoPass(int[] A) {
        int[] arr = new int[A.length];
        int t = 0;
        for (int i = 0; i < A.length; i++){
            if (A[i] % 2 == 0){
                arr[t++] = A[i];
            }
        }

        for (int j = 0; j < A.length; j++){
            if (A[j] % 2 == 1){
                arr[t++] = A[j];
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {3,1,2,4};
        System.out.println(Arrays.toString(sortArrayByParityTwoPass(arr)));
    }
}
