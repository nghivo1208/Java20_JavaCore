package Exercises;

import java.util.Scanner;

public class ExerciseNo5 {
    public ExerciseNo5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập toạ độ điểm A");
        System.out.print("Xa = ");
        int xa = sc.nextInt();
        System.out.print("Ya = ");
        int ya = sc.nextInt();
        System.out.println("Nhập toạ độ điểm B");
        System.out.print("Xb = ");
        int xb = sc.nextInt();
        System.out.print("Yb = ");
        int yb = sc.nextInt();

        double result = Math.sqrt((xb - xa) * (xb - xa) + (yb - ya) * (yb - ya));
        System.out.println("Chiều dài 2 điểm A(" + xa + "," + ya + ") " +
                "và B(" + xb + "," + yb + ") trên hệ trục Oxy: "
                + result);
    }
}
