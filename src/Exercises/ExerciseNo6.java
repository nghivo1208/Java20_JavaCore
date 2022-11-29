package Exercises;

import java.util.Scanner;

public class ExerciseNo6 {
    public ExerciseNo6() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String input = sc.nextLine();
        StringBuilder sb = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {
            sb.append(input.charAt(i));
        }
        System.out.print("Chuỗi sau khi sắp xếp: ");
        System.out.println(sb);
    }
}
