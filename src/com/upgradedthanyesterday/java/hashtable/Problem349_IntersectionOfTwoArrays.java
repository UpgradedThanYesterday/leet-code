package com.upgradedthanyesterday.java.hashtable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Problem: Intersection of Two Arrays
 * <br>
 * See <a href="https://github.com/UpgradedThanYesterday/leet-code/blob/main/src/com/upgradedthanyesterday/java/hashtable/Problem349_IntersectionOfTwoArrays.md">Problem349_IntersectionOfTwoArrays</a>
 */
public class Problem349_IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int i = 0; i<nums1.length; i++) {
            set1.add(nums1[i]);
        }

        for(int i = 0; i< nums2.length; i++) {
            set2.add(nums2[i]);
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(Integer i : set2) {
            if(set1.contains(i)) {
                list.add(i);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        Problem349_IntersectionOfTwoArrays obj = new Problem349_IntersectionOfTwoArrays();
        System.out.println("1st "+Arrays.toString(obj.intersection(new int[]{1,2,2,1}, new int[]{2,2})));
        System.out.println("2nd "+Arrays.toString(obj.intersection(new int[]{4,9,5}, new int[]{9,4,9,8,4})));
        System.out.println("3rd "+Arrays.toString(obj.intersection(new int[]{1,2,3}, new int[]{6,5,4})));
    }
}