package Exercises;

import java.util.Scanner;

public class ExerciseNo10 {
    public ExerciseNo10() {
        System.out.println("Nhập vào số tự nhiên: ");
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();
        int result = 0;
        for (int i = 1; i <= inputNumber; i++) {
            result += i;
        }
        System.out.println("Tổng các số từ 1 đến " + inputNumber + ": ");
        System.out.println(result);
    }
}
