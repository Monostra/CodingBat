package ua.string1;

public class C13theEnd {
    public static void main(String[] args) {
//        Given a string, return a string length 1 from its front, unless front is false, in which case return a string length 1 from its back. The string will be non-empty.
//
//
//                theEnd("Hello", true) → "H"
//        theEnd("Hello", false) → "o"
//        theEnd("oh", true) → "o"

        System.out.println(theEnd("Hello", true));
        System.out.println(theEnd("Hello", false));
        System.out.println(theEnd("oh", true));
    }

    public static String theEnd(String str, boolean front) {
        if(front){
            return str.substring(0,1);
        } else {
            return str.substring(str.length()-1);
        }
    }
}
