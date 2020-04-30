package sobs.javapractice;

/**
 * Created by sobeersingh on 30/04/20.
 */
public class ChallengeByteShortIntLong {
    public static void main( String [] args){
        Byte byteNumber = 10;
        Short shortNumber = 20;
        int intNumber = 50;
        //Long finalLongNumber = (50000L + 10L * (byteNumber + shortNumber + intNumber));
        Long finalLongNumber = (50000L + 10L * (byteNumber + shortNumber + intNumber));
        System.out.println("Final Long Number: " + finalLongNumber);
    }
}
