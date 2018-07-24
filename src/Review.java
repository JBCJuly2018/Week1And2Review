import java.util.Random;
import java.util.Scanner;

public class Review {

    public static void main(String[] args) {

        int z = 123;

        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        float piFloat = (float) Math.PI;
        double piDouble = Math.PI;

        System.out.println("pi as a float: " + piFloat);
        System.out.println("pi as a double: " + piDouble);

        int a = 1;
        int b = 2;
        int c = 3;

        System.out.println("This is addition: " + (a+b) );
        System.out.println("This is subtraction: " + (a-b));

        System.out.println("This is multiplication: " + (a*b));
        System.out.println("This is division: " + (a/b));

        // Find the sum of the three numbers listed:
        int sum = calcThreeNum(1,2,3);
        int anotherSum = calcThreeNum(4,5,6);

        output("First sum: " + sum);
        output("Second sum: " + anotherSum);
        output("This is another message...");

        boolean runLoop = true;
        int counter = 0;

        while(runLoop==true) {
            System.out.println("My loop is running...");
            counter = counter + 1;
            if (counter>10) {
                runLoop = false;
            }
        }

        for (int i=0; i<10; i++) {
            System.out.println("My for loop is running...");
        }

    }

    public static int calcThreeNum(int numOne, int numTwo, int numThree) {
        int sumOfThree = numOne + numTwo + numThree;
        return sumOfThree;
    }

    public static void output(String message) {
        System.out.println(message + "\t" + message);
    }


}
