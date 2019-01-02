package ua.warmup2;

public class C12stringX {
    public static void main(String[] args) {

//        Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.
//
//        stringX("xxHxix") → "xHix"
//        stringX("abxxxcd") → "abcd"
//        stringX("xabxxxcdx") → "xabcdx"

        System.out.println(stringX("xxHxix"));
        System.out.println(stringX("abxxxcd"));
        System.out.println(stringX("xabxxxcdx"));

    }


    public static String stringX(String str) {
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            if(i != 0 && i != str.length()-1) {
                if (str.charAt(i) != 'x') {
                    res += str.charAt(i);
                }
            }
            else {
                res += str.charAt(i);
            }

        }

        return res;
    }

    public static String stringX2(String str) {
        String result = "";
        for (int i=0; i<str.length(); i++) {
            // Only append the char if it is not the "x" case
            if (!(i > 0 && i < (str.length()-1) && str.substring(i, i+1).equals("x"))) {
                result = result + str.substring(i, i+1); // Could use str.charAt(i) here
            }
        }
        return result;
    }
}
