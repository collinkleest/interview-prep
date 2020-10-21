package leetcode.easy;

import java.util.HashMap;

public class E219 {

    public static boolean containsNearbyDuplicate(int[] nums, int k){

        // pre check
        if (nums.length < 2 || nums == null || k == 0) return false;

        // create hash map with Integer types
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        // loop through array
        for (int i = 0; i < nums.length; i++){
            if (hashMap.containsKey(nums[i])){
                if (Math.abs(hashMap.get(nums[i]) - i) <= k){
                    return true;
                }
            }
            hashMap.put(nums[i], i);
        }

        return false;
    }

    // driver code
    public static void main(String[] args) {
        int[] nums = {1,0,1,1};
        int k = 1;
        System.out.printf(String.valueOf(containsNearbyDuplicate(nums, k)));
    }

}
