package Exercises;

import java.util.Scanner;

public class ExerciseNo12 {
    public ExerciseNo12() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số tự nhiên từ 1 đến 9: ");
        int input = sc.nextInt();

        while (input < 1 || input > 9) {
            System.out.print("Nhập lại số tự nhiên từ 1 đến 9: ");
            input = sc.nextInt();
        }
        String result = "";
        for (int i = 1; i < input + 1; i++) {
            result += String.valueOf(i);
            System.out.println(result);
        }
    }
}
