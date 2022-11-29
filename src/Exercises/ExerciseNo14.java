package Exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ExerciseNo14 {
    public ExerciseNo14() {
        System.out.print("Nhập vào số phần tử: ");
        Scanner sc = new Scanner(System.in);
        int arrayLength = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> newList = new ArrayList<>();


        for (int i = 0; i < arrayLength; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + " : ");
            list.add(sc.nextInt());
        }
        for (Integer integer : list) {
            if (!newList.contains(integer)) {
                newList.add(integer);
            }
        }
        System.out.println(newList);
    }
}
