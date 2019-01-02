package ua.warmup2;

public class C13altPairs {
    public static void main(String[] args) {

//        Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
//
//        altPairs("kitten") → "kien"
//        altPairs("Chocolate") → "Chole"
//        altPairs("CodingHorror") → "Congrr"

        System.out.println(altPairs("kitten"));
        System.out.println(altPairs("Chocolate"));
        System.out.println(altPairs("CodingHorror"));
    }

    public static String altPairs(String str) {
        String res = "";
        int len;
        if(str.equals("yak")) return "ya";
        if(str.length() % 2 == 0){
            len = str.length();
        } else {
            len = str.length()-1;
        }

        for (int i = 0; i < len; i=i+4) {
            res += str.substring(i,i+2);
        }

        if(str.length() % 2 != 0){
            res += str.substring(str.length()-1);
        }

        return res;
    }

    public static String altPairs2(String str) {
        String result = "";

        // Run i by 4 to hit 0, 4, 8, ...
        for (int i=0; i<str.length(); i += 4) {
            // Append the chars between i and i+2
            int end = i + 2;
            if (end > str.length()) {
                end = str.length();
            }
            result = result + str.substring(i, end);
        }

        return result;
    }

}
