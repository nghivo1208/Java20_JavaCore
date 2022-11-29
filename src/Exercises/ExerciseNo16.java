package Exercises;

import java.util.Scanner;

public class ExerciseNo16 {
    public ExerciseNo16() {
        System.out.print("Nhập số năm cần kiểm tra năm nhuận: ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if (year % 4 == 0) {
            System.out.println("Năm " + year + " là năm nhuận");
        }
        if (year % 4 != 0) {
            System.out.println("Năm " + year + " là năm không nhuận");
        }
    }
}
