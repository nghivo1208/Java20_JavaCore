package Exercises;

import java.util.Scanner;

public class NavigateExercise {

    public NavigateExercise() {
        System.out.print("Chọn bài tập cần kiểm tra (chọn 1 trên tổng số 22 bài): ");
        Scanner sc = new Scanner(System.in);
        int ordinalNumberOfExercise = sc.nextInt();

        while (ordinalNumberOfExercise > 22 || ordinalNumberOfExercise < 1) {
            System.out.print("Lựa chọn vừa rồi không nằm trong khoảng 22, vui lòng nhập lại: ");
            ordinalNumberOfExercise = sc.nextInt();
        }

        switch (ordinalNumberOfExercise) {
            case 1 -> new ExerciseNo1();
            case 2 -> new ExerciseNo2();
            case 3 -> new ExerciseNo3();
            case 4 -> new ExerciseNo4();
            case 5 -> new ExerciseNo5();
            case 6 -> new ExerciseNo6();
            case 7 -> new ExerciseNo7();
            case 8 -> new ExerciseNo8();
            case 9 -> new ExerciseNo9();
            case 10 -> new ExerciseNo10();
            case 11 -> new ExerciseNo11();
            case 12 -> new ExerciseNo12();
            case 13 -> new ExerciseNo13();
            case 14 -> new ExerciseNo14();
            case 15 -> new ExerciseNo15();
            case 16 -> new ExerciseNo16();
            case 17 -> new ExerciseNo17();
            case 18 -> new ExerciseNo18();
            case 19 -> new ExerciseNo19();
            case 20 -> new ExerciseNo20();
            case 21 -> new ExerciseNo21();
            case 22 -> new ExerciseNo22();

        }
    }
}
