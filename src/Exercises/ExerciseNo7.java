package Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExerciseNo7 {
    public ExerciseNo7() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số tự nhiên: ");
        int input = sc.nextInt();

        List<Integer> result = new ArrayList<>();

        for (int i = input; i > 0; i--) {
            if (input % i == 0) {
                result.add(i);
            }
        }
        System.out.println(result);
    }
}
