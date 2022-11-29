package Exercises;

import java.util.Scanner;

public class ExerciseKara {
    Scanner sc = new Scanner(System.in);

    public ExerciseKara() {
        System.out.print("Nhập vào thời gian khách vào: ");
        int gioVao = checkTime(sc.nextInt());

        System.out.print("Nhập vào thời gian khách ra: ");
        int gioRa = checkTime(sc.nextInt());

        float giaTien = 0;

        if(gioRa-gioVao<3){
            if(gioRa<17){
                giaTien = (gioRa-gioVao)*(30000*20/100);
                System.out.println("Thành tiền: " + giaTien);
            }
            giaTien = (gioRa-gioVao)*30000;
            System.out.println("Thành tiền: " + giaTien);
        }else{
            if(gioRa<17){
                giaTien = (90000+ (gioRa-gioVao)*(90000*30/100))*(20/100);
                System.out.println("Thành tiền: " + giaTien);
            }
            giaTien = 90000+ (gioRa-gioVao)*(90000*30/100);
            System.out.println("Thành tiền: " + giaTien);
        }

    }

    int checkTime(int time){
        while (time<9 || time >17){
            System.out.print("Nhập vào thời gian khách vào: ");
            time = sc.nextInt();
        }
        return time;
    }
}
