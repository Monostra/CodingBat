package ua.warmup1;

public class StartOz {
    public static void main(String[] args) {
//        Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".
//
//        startOz("bzoo") → "z"
//        startOz("ozymandias") → "oz"
//        startOz("oxx") → "o"

        System.out.println(startOz("bzoo"));
        System.out.println(startOz("ozymandias"));
        System.out.println(startOz("oxx"));
        System.out.println(startOz("o"));
        System.out.println(startOz(""));
    }

    public static String startOz(String str) {
        String res = "";
        if(str.length()>0 && str.substring(0,1).equalsIgnoreCase("o")){
            res += str.substring(0,1);
        }
        if (str.length()>1 && str.substring(1, 2).equalsIgnoreCase("z")) {
            res += str.substring(1,2);
        }

        return res;
    }

    public static String startOz2(String str) {
        String result = "";

        if (str.length() >= 1 && str.charAt(0)=='o') {
            result = result + str.charAt(0);
        }

        if (str.length() >= 2 && str.charAt(1)=='z') {
            result = result + str.charAt(1);
        }

        return result;
    }
}
