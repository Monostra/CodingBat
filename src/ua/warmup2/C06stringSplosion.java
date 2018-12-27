package ua.warmup2;

public class C06stringSplosion {
    public static void main(String[] args) {
//        Given a non-empty string like "Code" return a string like "CCoCodCode".
//
//        stringSplosion("Code") → "CCoCodCode"
//        stringSplosion("abc") → "aababc"
//        stringSplosion("ab") → "aab"
//
        System.out.println(stringSplosion("Code"));
        System.out.println(stringSplosion("abc"));
        System.out.println(stringSplosion("ab"));
    }

    public static String stringSplosion(String str) {
        String res = "";
        for (int i = 0; i < str.length()+1; i++) {
            res += str.substring(0,i);
        }
        return res;
    }

    public static String stringSplosion2(String str) {
        String result = "";
        // On each iteration, add the substring of the chars 0..i
        for (int i=0; i<str.length(); i++) {
            result = result + str.substring(0, i+1);
        }
        return result;
    }
}
