package Exercises;

import java.util.Scanner;

public class ExerciseNo18 {
    public ExerciseNo18() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số tiền mong muốn: ");
        double tienMongMuon = sc.nextDouble();
        System.out.print("Nhập số tiền gốc: ");
        double tienGoc = sc.nextDouble();

        if (tienGoc > tienMongMuon) {
            System.out.print("Nhập lại số tiền mong muốn: ");
            tienMongMuon = sc.nextDouble();
            System.out.print("Nhập lại số tiền gốc: ");
            tienGoc = sc.nextDouble();
        }

        System.out.print("Nhập số lãi suất: ");
        double laiSuat = sc.nextDouble();

        if (laiSuat < 0 || laiSuat > 1) {
            System.out.print("Nhập lại số lãi suất do không thoả điều kiện: ");
            laiSuat = sc.nextDouble();
        }
        tinhThoiGianNhanTien(tienMongMuon, tienGoc, laiSuat);

    }

    void tinhThoiGianNhanTien(double tienMongMuon, double tienGoc, double laiSuat) {
        int soNam = 0;
        double tienLai = 0;
        while (tienGoc < tienMongMuon) {
            tienLai = tienGoc * (laiSuat / 100);
            tienGoc += tienLai;
            soNam += 1;
        }
        System.out.println("Sau " + soNam + " năm thì người X đạt được số tiền mong muốn, số tiền đạt được: " + tienGoc);
    }
}
