package ua.string1;

public class C21atFirst {
    public static void main(String[] args) {

//        Given a string, return a string length 2 made of its first 2 chars. If the string length is less than 2, use '@' for the missing chars.
//
//
//                atFirst("hello") → "he"
//        atFirst("hi") → "hi"
//        atFirst("h") → "h@"

        System.out.println(atFirst("hello"));
        System.out.println(atFirst("hi"));
        System.out.println(atFirst("h"));
        System.out.println(atFirst(""));

    }

    public static String atFirst(String str) {
        if(str.length()<2){
            for (int i = 0; i < 2; i++) {
                if(str.length()<2){
                    str+="@";
                }
            }
            return str;
        } else {
            return str.substring(0,2);
        }
    }

}
