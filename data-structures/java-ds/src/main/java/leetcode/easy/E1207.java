package leetcode.easy;

import java.util.HashMap;
import java.util.HashSet;

public class E1207 {

    public static boolean uniqueOccurances(int[] arr){

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < arr.length; i++){
            if (hashMap.containsKey(arr[i])){
                hashMap.put(arr[i], hashMap.get(arr[i]) + 1);
            } else {
                hashMap.put(arr[i], 1);
            }
        }


        for (Integer x : hashMap.values()){
            if (hashSet.contains(x)){
                return false;
            }
            hashSet.add(x);
        }

        return true;
    }


    public static void main(String[] args) {

    }

}
