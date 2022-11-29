package Exercises;

import java.util.Scanner;

public class ExerciseNo2 {
    Scanner sc = new Scanner(System.in);
    public ExerciseNo2() {
        System.out.print("Lựa chọn hệ số cần chuyển đổi: ");
        byte heSo = sc.nextByte();
        while(heSo != 2 || heSo !=10){
            System.out.println("Nhập lại hệ số (nhập 2 để chuyển đổi hệ số 2, nhập 10 để chuyển đổi hệ số 10): ");
            heSo = sc.nextByte();
        }

        switch (heSo){
            case 2:
                System.out.println("");
            case 10:
        }

    }

    void chuyenDoiHeSo(){
        StringBuilder sb;

    }
}
