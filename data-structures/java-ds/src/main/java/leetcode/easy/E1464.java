package leetcode.easy;

import java.util.Arrays;

public class E1464 {

    public static int maxProduct(int[] nums){
        Arrays.sort(nums);
        int ans = (nums[nums.length -1 ] -1) * (nums[(nums.length - 2)] -1);
        return ans;
    }

    // driver code
    public static void main(String[] args) {
        int[] inputArray = {3, 4, 5, 2};
        System.out.println(maxProduct(inputArray));
    }

}
