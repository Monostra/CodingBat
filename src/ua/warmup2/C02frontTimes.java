package ua.warmup2;

public class C02frontTimes {
    public static void main(String[] args) {
//        Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is there if the string is less than length 3. Return n copies of the front;
//
//        frontTimes("Chocolate", 2) → "ChoCho"
//        frontTimes("Chocolate", 3) → "ChoChoCho"
//        frontTimes("Abc", 3) → "AbcAbcAbc"

        System.out.println(frontTimes("Chocolate", 2));
        System.out.println(frontTimes("Chocolate", 3));
        System.out.println(frontTimes("Abc", 3));
    }

    public static String frontTimes(String str, int n) {
        String res = "";
        if (str.length() > 3) str = str.substring(0, 3);
        for (int i = 0; i < n; i++) {
            res += str;
        }
        return res;
    }

    public static String frontTimes2(String str, int n) {
        int frontLen = 3;
        if (frontLen > str.length()) {
            frontLen = str.length();
        }
        String front = str.substring(0, frontLen);

        String result = "";
        for (int i=0; i<n; i++) {
            result = result + front;
        }
        return result;
    }
}
