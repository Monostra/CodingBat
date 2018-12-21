package ua.warmup1;

public class SumDouble {
    public static void main(String[] args) {
//        sumDouble(1, 2) → 3
//        sumDouble(3, 2) → 5
//        sumDouble(2, 2) → 8
        sumDouble(1, 2);
        sumDouble(3, 2);
        sumDouble(2, 2);


    }

    public static int sumDouble(int a, int b) {
        if(a == b){
            System.out.println((a+b)*2);
            return (a+b)*2;
        }
        System.out.println(a+b);
        return a+b;
    }

    public static int sumDouble2(int a, int b) {
        // Store the sum in a local variable
        int sum = a + b;

        // Double it if a and b are the same
        if (a == b) {
            sum = sum * 2;
        }

        return sum;
    }
}
