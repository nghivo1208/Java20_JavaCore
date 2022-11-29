package Exercises;

import java.util.Scanner;

public class ExerciseNo9 {
    public ExerciseNo9() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tự nhiên từ 10 đến 99");
        System.out.print("Nhập số tự nhiên thứ nhất: ");
        int firstNumber = sc.nextInt();

        while (firstNumber < 10 || firstNumber > 99) {
            System.out.print("Nhập lại số tự nhiên từ 10 đến 99: ");
            firstNumber = sc.nextInt();
        }

        System.out.print("Nhập số tự nhiên thứ hai: ");
        int secondNumber = sc.nextInt();

        while (secondNumber < 10 || secondNumber > 99) {
            System.out.print("Nhập lại số tự nhiên từ 10 đến 99: ");
            secondNumber = sc.nextInt();
        }

        char[] chars = String.valueOf(firstNumber).toCharArray();
        for (int i = 0; i < chars.length; i++) {
            while (String.valueOf(secondNumber).contains(String.valueOf(chars[i]))) {
                System.out.println(true);
                break;
            }
        }
    }
}
