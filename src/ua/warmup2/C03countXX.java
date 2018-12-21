package ua.warmup2;

import java.util.ArrayList;

public class C03countXX {
    public static void main(String[] args) {

//        Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
//
//        countXX("abcxx") → 1
//        countXX("xxx") → 2
//        countXX("xxxx") → 3

        System.out.println(countXX("abcxx"));
        System.out.println(countXX("xxx"));
        System.out.println(countXX("xxxx"));
        System.out.println(countXX("aoeuxx aoeuxx"));
        System.out.println(countXX("aoeu"));
    }

    static int countXX(String str) {
        int count = 0;
        String[] strs = str.split(" ");
        for (int j = 0; j < strs.length; j++) {
            for (int i = 0; i < strs[j].length(); i++) {
                if (str.charAt(i) == 'x') count++;
            }
            count = count == 0 ? 0 : count - 1;
        }
        return count;
    }

    static int countXX2(String str) {
        int count = 0;
        for (int i = 0; i < str.length()-1; i++) {
            if (str.substring(i, i+2).equals("xx")) count++;
        }
        return count;
    }

    // Solution notes: the loop is shortened to end at str.length()-1
    // so we can pull out a length 2 substring without going out of bounds.
    // Remember to use equals() to compare strings, not ==.

}
