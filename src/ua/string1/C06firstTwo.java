package ua.string1;

public class C06firstTwo {
    public static void main(String[] args) {
//        Given a string, return the string made of its first two chars, so the String "Hello" yields "He".
//                If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "". Note that str.length() returns the length of a string.
//
//
//        firstTwo("Hello") → "He"
//        firstTwo("abcdefg") → "ab"
//        firstTwo("ab") → "ab"

        System.out.println(firstTwo("Hello"));
        System.out.println(firstTwo("abcdefg"));
        System.out.println(firstTwo("ab"));
    }

    public static String firstTwo(String str) {
        if(str.length()<2) return str;
        String start = str.substring(0,2);
        return start;
    }

    public static String firstTwo2(String str) {
        if (str.length() >= 2) {
            return str.substring(0, 2);
        } else {
            return str;
        }
        // Solution notes: need an if/else structure to call substring if the length
        // is 2 or more, and otherwise returnn the string itself
    }

}
