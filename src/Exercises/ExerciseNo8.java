package Exercises;

import java.util.Scanner;

public class ExerciseNo8 {
    public ExerciseNo8() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào chuỗi viết thường: ");
        String input = sc.nextLine();

        String[] s = input.split(" ");
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < s.length; i++) {
            char[] chars = s[i].toCharArray();
            chars[0] = Character.toUpperCase(chars[0]);
            if (i == s.length - 1) {
                sb.append(chars);
            } else {
                sb.append(chars);
                sb.append(" ");
            }
        }
        System.out.println("Chuỗi viết hoa: " + sb);
    }
}
