package ua.warmup2;

public class C05stringBits {
    public static void main(String[] args) {

//        Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
//
//        stringBits("Hello") → "Hlo"
//        stringBits("Hi") → "H"
//        stringBits("Heeololeo") → "Hello"

        System.out.println(stringBits("Hello"));
        System.out.println(stringBits("Hi"));
        System.out.println(stringBits("Heeololeo"));
    }

    public static String stringBits(String str) {
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            if(i%2==0){
                res += str.charAt(i);
            }
        }
        return res;
    }

    public static String stringBits2(String str) {
        String result = "";
        // Note: the loop increments i by 2
        for (int i=0; i<str.length(); i+=2) {
            result = result + str.substring(i, i+1);
            // Alternately could use str.charAt(i)
        }
        return result;
    }
}
