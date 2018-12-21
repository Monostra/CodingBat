package ua.warmup1;

public class StringE {
    public static void main(String[] args) {
//        Return true if the given string contains between 1 and 3 'e' chars.
//
//        stringE("Hello") → true
//        stringE("Heelle") → true
//        stringE("Heelele") → false

        System.out.println(stringE("Hello"));
        System.out.println(stringE("Heelle"));
        System.out.println(stringE("Heelele"));
    }

    public static boolean stringE(String str) {
        int count = 0;
        for (int i = 0; i <str.length(); i++) {
            if (str.charAt(i) == 'e'){
                count++;
            }
        }
        if (count >= 1 && count <= 3) return true;
        return false;
    }


    public static boolean stringE2(String str) {
        int count = 0;

        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) == 'e') count++;
            // alternately: str.substring(i, i+1).equals("e")
        }

        return (count >= 1 && count <= 3);
    }
}
