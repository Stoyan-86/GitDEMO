package Demo;

import java.util.Scanner;

public class isEvenNumber {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(isEven(num));
    }

    public static boolean isEven(int num) {

        if (num % 2 == 0) {

            return true;
        }
        return false;
    }
}
