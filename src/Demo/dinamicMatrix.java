package Demo;

import java.util.Scanner;

public class dinamicMatrix {
    public static void main(String[] args) {
        System.out.println("Enter a number of rows:");
        Scanner i = new Scanner(System.in);
        int rows = i.nextInt();

        System.out.println("Enter a number of columns:");
        Scanner j = new Scanner(System.in);
        int col = j.nextInt();

        int[][] arr = new int[rows][col];

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < col; c++)
            System.out.format("%d%d ", r, c);
            System.out.println();
        }
    }
}
