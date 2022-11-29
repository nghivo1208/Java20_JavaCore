package Exercises;

import java.util.Scanner;

public class ExerciseNo19 {
    public ExerciseNo19() {
        System.out.print("Nhập 1 để giải phương trình bậc 1, nhập 2 để giải phương trình bậc 2: ");
        Scanner sc = new Scanner(System.in);
        int bacPhuongTrinh = sc.nextInt();
        while (bacPhuongTrinh != 1 && bacPhuongTrinh != 2) {
            System.out.print("Nhập lại giá trị bậc phương trình cần tính: ");
            bacPhuongTrinh = sc.nextInt();
        }

        switch (bacPhuongTrinh) {
            case 1:
                System.out.print("Nhập các giá trị của phương trình bậc 1 (ax+b=0): \na= ");
                float a = sc.nextFloat();
                System.out.print("b = ");
                float b = sc.nextFloat();
                System.out.println("Giá trị x cần tìm: " + (-b / a));
            case 2:
                System.out.print("Nhập các giá trị của phương trình bậc 1 (ax^2+bx+c=0): \na= ");
                a = sc.nextFloat();
                System.out.print("b = ");
                b = sc.nextFloat();
                System.out.print("c = ");
                float c = sc.nextFloat();

                float delta = b * b - 4 * a * c;
                float x1;
                float x2;

                if (delta > 0) {
                    x1 = (float) ((-b + Math.sqrt(delta)) / 2 * a);
                    x2 = (float) ((-b - Math.sqrt(delta)) / 2 * a);
                    System.out.println("Phương trình có 2 nghiệm:\nx1= " + x1 + "\nx2= " + x2);
                } else if (delta == 0) {
                    x1 = -b / (2 * a);
                    System.out.println("Phương trình có 1 nghiệm x= " + x1);
                } else {
                    System.out.println("Phương trình vô nghiệm");
                }
        }
    }
}
