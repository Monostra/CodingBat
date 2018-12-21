package ua.warmup1;

import static java.lang.Math.abs;

public class Diff21 {
    public static void main(String[] args) {
//        diff21(19) → 2
//        diff21(10) → 11
//        diff21(21) → 0
        System.out.println(diff21(19));
        System.out.println(diff21(10));
        System.out.println(diff21(21));
        System.out.println(diff21(22));
        System.out.println(diff21(25));


    }

    public static int diff21(int n){
//        int res = abs(21-n);
        int res = 21-n;
        if(n>21){
            res = (-1*res)*2;
        }
        return res;
    }

    public static int diff21_2(int n) {
        if (n <= 21) {
            return 21 - n;
        } else {
            return (n - 21) * 2;
        }
    }
}
