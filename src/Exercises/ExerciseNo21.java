package Exercises;

import java.util.Scanner;

public class ExerciseNo21 {
    public ExerciseNo21() {
        initValue();

    }

    Scanner sc = new Scanner(System.in);

    public void initValue() {

        System.out.println("Nhập các giá trị địa chỉ và vận tốc của 2 Kangaroo");
        System.out.print("Địa chỉ 1: ");
        double x1 = checkLimit(sc.nextDouble());
        System.out.print("Vận tốc 1: ");
        double v1 = checkLimit(sc.nextDouble());
        System.out.print("Địa chỉ 2: ");
        double x2 = checkLimit(sc.nextDouble());
        System.out.print("Vận tốc 2: ");
        double v2 = checkLimit(sc.nextDouble());

        canMeet(x1, v1, x2, v2);
    }

    double checkLimit(double value) {
        while (value < 0 || value > 10000) {
            System.out.println("Nhập lại giá trị do vượt quá giới hạn");
            value = sc.nextDouble();
        }
        return value;
    }

    void canMeet(double x1, double v1, double x2, double v2) {
        if (((x1 < x2) || (v1 < v2)) && ((x2 < x1) || (v2 < v1))) {
            System.out.println("2 Kangaroo có thể gặp nhau");
        }else{
            System.out.println("2 Kangaroo không thể gặp nhau");
        }
    }
}
