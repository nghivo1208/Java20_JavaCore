package Exercises;

import java.util.Scanner;
import java.util.Stack;

public class ExerciseNo2 {
    Scanner sc = new Scanner(System.in);

    public ExerciseNo2() {
        System.out.print("Lựa chọn hệ số cần chuyển đổi: ");
        byte heSo = sc.nextByte();
        while (!(heSo == 2|| heSo == 10)) {
            System.out.println("Nhập lại hệ số (nhập 2 để chuyển đổi hệ số 2, nhập 10 để chuyển đổi hệ số 10): ");
            heSo = sc.nextByte();
        }
        chuyenDoiHeSo(heSo);
    }

    void chuyenDoiHeSo(byte heSo) {

        System.out.print("Nhập số cần chuyển đổi: ");
        int inputNumber = sc.nextInt();

        switch (heSo) {
            case 2:
                decimalToBinary(inputNumber);
                break;

            case 10:
                int result = binaryToDecimal(inputNumber);
                System.out.println("Giá trị nhị phân sau khi chuyển đổi sang thập phân: " + result);
                break;
        }
    }

    public void decimalToBinary(int decimalNumber){
        Stack<Integer> stack = new Stack<>();
        while (decimalNumber != 0) {
            stack.push(decimalNumber % 2);
            decimalNumber /= 2;
        }

        System.out.print("Giá trị thập phân sau khi chuyển đổi sang nhị phân: ");

        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }

    public int binaryToDecimal(int binaryNumber){
        int decimal = 0;
        int p = 0;
        while(true){
            if(binaryNumber == 0){
                break;
            } else {
                int temp = binaryNumber%10;
                decimal += temp*Math.pow(2, p);
                binaryNumber = binaryNumber/10;
                p++;
            }
        }
        return decimal;
    }
}
