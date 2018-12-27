package ua.warmup2;

public class C04doubleX {
    public static void main(String[] args) {

//        Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
//
//        doubleX("axxbb") → true
//        doubleX("axaxax") → false
//        doubleX("xxxxx") → true

        System.out.println(doubleX("axxbb"));
        System.out.println(doubleX("axaxax"));
        System.out.println(doubleX("xxxxx"));
        System.out.println(doubleX("xaxxx"));

    }

    static boolean doubleX(String str) {

        for (int i = 0; i < str.length()-1; i++) {
            if(str.substring(i, i+1).equals("x") ) {
                if (str.substring(i+1, i+2).equals("x")) {
                    return true;
                }else {
                    return false;
                }
            }

        }
        return false;
    }

    static boolean doubleX2(String str) {
        int i = str.indexOf("x");
        if (i == -1) return false; // no "x" at all

        // Is char at i+1 also an "x"?
        if (i+1 >= str.length()) return false; // check i+1 in bounds?
        return str.substring(i+1, i+2).equals("x");

        // Another approach -- .startsWith() simplifies the logic
        // String x = str.substring(i);
        // return x.startsWith("xx");
    }


}
