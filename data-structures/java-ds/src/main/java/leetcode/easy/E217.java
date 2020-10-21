package leetcode.easy;

import java.util.Arrays;
import java.util.HashSet;

public class E217 {

    public static boolean containsDuplicateHashSet(int[] nums){
        // pre check
        if (nums.length <= 1 || nums == null) return false;

        // instantiate empty hash set
        HashSet<Integer> hashSet = new HashSet<>();

        // loop
        for (int i = 0; i < nums.length; i++){
            if (hashSet.contains(nums[i])) return true;
            hashSet.add(nums[i]);
        }
        return false;
    }

    public static boolean containsDuplicateSort(int[] nums){
        Arrays.sort(nums);
        for(int i = 0; i < (nums.length - 1); i++) {
            if (nums[i] == nums[i+1]) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};

        long startTime;
        long endTime;

        // benchmark test
        startTime = System.nanoTime();
        boolean sortAns = containsDuplicateSort(nums);
        endTime = System.nanoTime();
        System.out.println(String.format("Total Execution Time of Sort Method: %s nano seconds", (endTime - startTime)));
        startTime = System.nanoTime();
        boolean hashAns = containsDuplicateHashSet(nums);
        endTime = System.nanoTime();
        System.out.println(String.format("Total Execution Time of Sort Method: %s nano seconds", (endTime - startTime)));
    }

}
