package ua.warmup2;

public class C10array123 {
    public static void main(String[] args) {

//        Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
//
//        array123([1, 1, 2, 3, 1]) → true
//        array123([1, 1, 2, 4, 1]) → false
//        array123([1, 1, 2, 1, 2, 3]) → true

        System.out.println(array123(new int[]{1, 1, 2, 3, 1}));
        System.out.println(array123(new int[]{1, 1, 2, 4, 1}));
        System.out.println(array123(new int[]{1, 1, 2, 1, 2, 3}));
    }

    public static boolean array123(int[] nums) {
        boolean one = false;
        boolean two = false;
        boolean three = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) one = true;
            if (nums[i] == 2) two = true;
            if (nums[i] == 3) three = true;
        }
        if(one && two && three){
            return true;
        } else {
            return false;
        }
    }

    public static boolean array123_2(int[] nums) {
        // Note: iterate < length-2, so can use i+1 and i+2 in the loop
        for (int i=0; i < (nums.length-2); i++) {
            if (nums[i]==1 && nums[i+1]==2 && nums[i+2]==3) return true;
        }
        return false;
    }
}
