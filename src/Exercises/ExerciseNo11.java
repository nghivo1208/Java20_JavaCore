package Exercises;

import java.util.Scanner;

public class ExerciseNo11 {
    public ExerciseNo11() {
        System.out.print("Nhập vào số tự nhiên: ");
        Scanner sc = new Scanner(System.in);

        double input = sc.nextDouble();
        double compareNumber = Math.log(input) / Math.log(2.0);

        System.out.println((int) compareNumber);
    }
}
