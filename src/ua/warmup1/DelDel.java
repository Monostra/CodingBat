package ua.warmup1;

public class DelDel {
    public static void main(String[] args) {
//        Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. Otherwise, return the string unchanged.
//
//        delDel("adelbc") → "abc"
//        delDel("adelHello") → "aHello"
//        delDel("adedbc") → "adedbc"

        System.out.println(delDel("adelbc"));
        System.out.println(delDel("adelHello"));
        System.out.println(delDel("adedbc"));
        System.out.println(delDel("abcdel"));

    }

    public static String delDel(String str) {
        if(str.length() >= 4){
            String del = str.substring(1,4);
            if(del.equalsIgnoreCase("del")) {
                return str.replace("del", "");
            }
        }
        return str;
    }

    public static String delDel2(String str) {
        if (str.length()>=4 && str.substring(1, 4).equals("del")) {
            // First char + rest of string starting at 4
            return str.substring(0, 1) + str.substring(4);
        }
        // Otherwise return the original string.
        return str;
    }

}
