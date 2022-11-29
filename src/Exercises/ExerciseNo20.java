package Exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ExerciseNo20 {
    public ExerciseNo20() {
        System.out.print("Nhập vào số phần tử: ");
        Scanner sc = new Scanner(System.in);
        int arrayLength = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> oddList = new ArrayList<>();
        ArrayList<Integer> evenList = new ArrayList<>();

        for (int i = 0; i < arrayLength; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + " : ");
            list.add(sc.nextInt());
        }

        for (Integer integer : list) {
            if (integer % 2 == 0) {
                evenList.add(integer);
            } else {
                oddList.add(integer);
            }
        }
        System.out.println("\n--- Chuỗi sau khi sắp xếp ---\nChuỗi chẵn: " + evenList);
        System.out.println("Chuỗi lẻ: " + oddList);
    }
}
