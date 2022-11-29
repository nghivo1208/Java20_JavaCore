package Exercises;

import java.util.Random;
import java.util.Scanner;

public class ExerciseNo17 {
    public ExerciseNo17() {
        Random generator = new Random();
        int randomNumber = generator.nextInt(1001);
        Scanner sc = new Scanner(System.in);
        System.out.print("Giá trị dự đoán: ");
        int pickNumber = sc.nextInt();
        int graterNumber = 1000;
        int lowerNumber = 0;
        while (pickNumber != randomNumber) {
            if (pickNumber > randomNumber) {
                System.out.println("\n----- Nhập số nhỏ hơn -----\n");
                graterNumber = pickNumber;
            } else {
                System.out.println("\n----- Nhập số lớn hơn -----\n");
                lowerNumber = pickNumber;
            }
            System.out.print("Nhập tiếp số trong khoảng từ " + lowerNumber + " đến " + graterNumber + ": ");
            pickNumber = sc.nextInt();
        }
        System.out.println("Bạn đã chọn đúng số ngẫu nhiên bí mật :" + randomNumber);
    }
}
