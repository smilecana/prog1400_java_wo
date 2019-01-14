package ca.prog1400;

import java.util.Scanner;

public class GradeConverter {
    public static void main(String[] args) {

    char[] letterGrade = {'A', 'B', 'C', 'D', 'F'};
    double[] numericGrade = {4.0, 3.0, 2.0, 1.0, 0.0};

    System.out.println("Please input your letter Grade :");
    Scanner sc = new Scanner(System.in);
    char inputedGrade = sc.next().charAt(0);;

        for (int i = 0; i < letterGrade.length; i++) {
            if (inputedGrade == letterGrade[i])
            {
                String output = String.format(
                        "The numeric grade is %.2f", numericGrade[i]);
                System.out.println(output);
                break;

            }
        }


    }

}
