package ua.warmup1;

public class MonkeyTrouble {
    public static void main(String[] args) {
        monkeyTrouble(true, true);
        monkeyTrouble(false, false);
        monkeyTrouble(true, false);
    }
    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if(aSmile == bSmile){
            System.out.println("true");
            return true;
        }
        System.out.println("false");
        return false;
    }

    public static boolean monkeyTrouble2(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile) {
            return true;
        }
        if (!aSmile && !bSmile) {
            return true;
        }
        return false;
        // The above can be shortened to:
        //   return ((aSmile && bSmile) || (!aSmile && !bSmile));
        // Or this very short version (think about how this is the same as the above)
        //   return (aSmile == bSmile);
    }
}
