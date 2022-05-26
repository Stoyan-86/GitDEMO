package Demo;

import java.util.Scanner;

public class Triangle_Possible {
    public static void main(String[] args) {

        double angleA;
        double angleB;
        double angleC;
        double sumAngles;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Add angleA");
        angleA = scanner.nextDouble();

        System.out.println("Add angleB");
        angleB = scanner.nextDouble();

        System.out.println("Add angleC");
        angleC = scanner.nextDouble();

        sumAngles = angleA+angleB+angleC;
//      System.out.printf("The sum of the degrees of the angles of the triangle is equal to " +sumAngles);

        if (angleA >0 && angleB>0 && angleC>0){

            if(sumAngles == 180) {
                System.out.println("The triangle is possible");
                {
                    if (angleA == 90 || angleB == 90 || angleC == 90) {
                        System.out.println("The triangle is right-angle");
                    }else if (angleA < 90 && angleB <90 && angleC < 90){
                        System.out.printf("The triangle is aqute");

                    } else {
                        System.out.println("The triangle is obtuse");
                    }
                }
            } else {
                System.out.println("The triangle is not possible because the sum of angles is " + sumAngles);
            }



        } else {
                System.out.println("The triangle is not possible enter positive values");
        }
    }
}
