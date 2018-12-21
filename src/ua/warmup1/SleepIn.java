package ua.warmup1;

public class SleepIn {
    public static void main(String[] args) {
        sleepIn(false,false);
        sleepIn(true,false);
        sleepIn(false, true);
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {

        if(!weekday && !vacation ){
            System.out.println("true");
            return true;
        } else if(weekday && !vacation){
            System.out.println("false");
            return  false;
        } else if(!weekday && vacation){
            System.out.println("true");
            return  true;
        } else {
            return true;
        }

    }

    public static boolean sleepIn2(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }

        return false;

        // Solution notes: better to write "vacation" than "vacation == true"
        // though they mean exactly the same thing.
        // Likewise "!weekday" is better than "weekday == false".
        // This all can be shortened to: return (!weekday || vacation);
        // Here we just put the return-false last, or could use an if/else.
    }
}
