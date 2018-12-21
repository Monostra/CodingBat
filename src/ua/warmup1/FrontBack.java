package ua.warmup1;

public class FrontBack {
    public static void main(String[] args) {

//        Given a string, return a new string where the first and last chars have been exchanged.
//
//        frontBack("code") → "eodc"
//        frontBack("a") → "a"
//        frontBack("ab") → "ba"
        System.out.println(frontBack("code"));
        System.out.println(frontBack("a"));
        System.out.println(frontBack("ab"));
    }

    public static String frontBack(String str) {
        String res = "";
        String res2 = "";
        String first = "";
        String last = "";

        int len = str.length();
        for (int i = 0; i < str.length(); i++) {
            if(i == 0){
                first += str.charAt(i);
            }
            if(i == len-1){
                last += str.charAt(i);
            }
        }
        res = str.replaceFirst(first, last);
        for (int i = 0; i < res.length(); i++) {
            if(i == len-1){
                res2 += first;
            } else {
                res2 += res.charAt(i);
            }
        }
        return res2;
    }

    public static String frontBack2(String str) {
        if (str.length() <= 1) return str;

        String mid = str.substring(1, str.length()-1);

        // last + mid + first
        return str.charAt(str.length()-1) + mid + str.charAt(0);
    }
}
