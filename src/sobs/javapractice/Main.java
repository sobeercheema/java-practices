package sobs.javapractice;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello my first java program!");
        
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue  = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value: " + myMinIntValue);
        System.out.println("Integer Maximum Value: " + myMaxIntValue);
        System.out.println("Busted Min Value: " + (myMinIntValue - 1));
        System.out.println("Busted Max Value: " + (myMaxIntValue + 1));

        Short myMinShortValue = Short.MIN_VALUE;
        Short myMaxShortValue  = Short.MAX_VALUE;
        System.out.println("Short Minimum Value: " + myMinShortValue);
        System.out.println("Short Maximum Value: " + myMaxShortValue);

        Byte myMinByteValue = Byte.MIN_VALUE;
        Byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value: " + myMinByteValue);
        System.out.println("Byte Maximum Value: " + myMaxByteValue);

        Long myMinLongValue = Long.MIN_VALUE;
        Long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value: " + myMinLongValue);
        System.out.println("Long Maximum Value: " + myMaxLongValue);

        Long testLong = 2147483647L;

    }
}
