package Demo;

public class arraySum {
    public static void main(String[] args) {
        int myArray[] = {2, 4, 6, 8, 10};
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum = sum + myArray[i];
        }
        System.out.println("Sum of the elements in the array: " + sum);
    }
}
