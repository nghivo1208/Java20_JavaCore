package Exercises;

import java.util.Scanner;

public class ExerciseNo4 {
    public ExerciseNo4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số cần tính: ");
        int calNumber = sc.nextInt();

        int reminder = 0;
        var storeNumber = calNumber;

        while (storeNumber > 0) {
            reminder += storeNumber % 10;
            System.out.println(reminder);
            storeNumber /= 10;
        }

        System.out.println("Tổng số các chữ số trong số " + calNumber + " : " + reminder);
    }
}
