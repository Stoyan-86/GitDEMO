package Demo;

public class diagonalSum {
    public static void main(String[] args) {
        int[][] arr = new int[4][4]; //row : column
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[0][3] = 4;

        arr[1][0] = 5;
        arr[1][1] = 6;
        arr[1][2] = 7;
        arr[1][3] = 8;

        arr[2][0] = 9;
        arr[2][1] = 10;
        arr[2][2] = 11;
        arr[2][3] = 12;

        arr[3][0] = 13;
        arr[3][1] = 14;
        arr[3][2] = 15;
        arr[3][3] = 16;

        for (int i = 0; i < 4; i++) {
            System.out.print(" " + arr[i][0]);
            System.out.print(" " + arr[i][1]);
            System.out.print(" " + arr[i][2]);
            System.out.print(" " + arr[i][3]);
            System.out.println("");
        }

        int diagonal1Sum =(arr[0][0] + arr[1][1] + arr[2][2] + arr[3][3]);
        System.out.println("The sum of diagonal 1 is: " + diagonal1Sum);

        int diagonal2Sum =(arr[0][3] + arr[1][2] + arr[2][1] + arr[3][0]);
        System.out.println("The sum of diagonal 2 is: " + diagonal2Sum);
    }
}
