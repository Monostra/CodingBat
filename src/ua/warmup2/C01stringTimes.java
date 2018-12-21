package ua.warmup2;

public class C01stringTimes {
    public static void main(String[] args) {

//        Given a string and a non-negative int n, return a larger string that is n copies of the original string.
//
//        stringTimes("Hi", 2) → "HiHi"
//        stringTimes("Hi", 3) → "HiHiHi"
//        stringTimes("Hi", 1) → "Hi"

        System.out.println(stringTimes("Hi", 2));
        System.out.println(stringTimes("Hi", 3));
        System.out.println(stringTimes("Hi", 1));
    }

    public static String stringTimes(String str, int n) {
        String res = "";
        for (int i = 0; i < n; i++) {
            res += str;
        }
        return res;
    }

}
