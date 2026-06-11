package com.upgradedthanyesterday.java.hashtable.solutions;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem: Intersection of Two Arrays
 * <br>
 * See <a href="https://github.com/UpgradedThanYesterday/leet-code/blob/main/src/com/upgradedthanyesterday/java/hashtable/problems/Problem06_ZigzagConversion.md">Problem349_IntersectionOfTwoArrays</a>
 */
public class Problem06_ZigzagConversion {
    public String convert(String s, int numRows) {
        if(numRows<=1 || s.length() <= numRows) {
            return s;
        }
        Map<Integer, String> map = new HashMap<>();
        int index = 0;
        boolean isTopDown = true;
        for(char c : s.toCharArray()) {
            String tmp = map.get(index);
            if(tmp == null) {
                map.put(index, ""+c);
            } else {
                map.put(index, tmp+c);
            }
            if(isTopDown) {
                index++;
            } else {
                index--;
            }
            if(index == numRows) {
                index = index-2; // reset;
                isTopDown = false; // reset
            }
            if(index<0) {
                index = 1; // reset;
                isTopDown = true; // reset
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i<numRows; i++) {
            stringBuilder.append(map.get(i));
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Problem06_ZigzagConversion conversion = new Problem06_ZigzagConversion();
        String s = conversion.convert("PAYPALISHIRING", 30);
        System.out.println(s);
    }
}
