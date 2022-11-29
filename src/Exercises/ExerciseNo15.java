package Exercises;

import java.util.Scanner;

public class ExerciseNo15 {
    public ExerciseNo15() {
        System.out.println("Nhập chuỗi: ");
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        System.out.print("a/ Chiều dài của chuỗi: ");
        System.out.println(str.length());

        System.out.print("b/ Nhập vào vị trí cần in ra: ");
        String index = sc.nextLine();
        System.out.println("   Ký tự tại vị trí " + index + " là: " + str.charAt(Integer.parseInt(index)));

        System.out.println("c/ Chuỗi có chứa chuỗi phụ \"abcdef\" không? " + str.contains("abcdef"));
    }
}
