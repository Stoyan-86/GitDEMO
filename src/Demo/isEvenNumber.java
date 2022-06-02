package Demo;

import java.util.Scanner;

public class isEvenNumber {

    public static void main(String args[]) {

        //This creates a Scanner Object

        Scanner input = new Scanner(System.in);

        //This gets input for the number

        int num = input.nextInt();

        //This calls the function

        System.out.println(isEven(num));

    }

    public static boolean isEven(int num) {

        //This returns true, if num is even

        if (num % 2 == 0) {

            return true;

        }

        //This returns false, if otherwise

        return false;

    }

}
