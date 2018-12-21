package ua.warmup1;

public class BackAround {
    public static void main(String[] args) {
//        Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more.
//
//        backAround("cat") → "tcatt"
//        backAround("Hello") → "oHelloo"
//        backAround("a") → "aaa"

        System.out.println(backAround("cat"));
        System.out.println(backAround("Hello"));
        System.out.println(backAround("a"));
    }

    public static String backAround(String str) {
        return str.charAt(str.length()-1) + str + str.charAt(str.length()-1);
    }
    public static String backAround2(String str) {
        // Get the last char
        String last = str.substring(str.length() - 1);
        return last + str + last;
    }
}
