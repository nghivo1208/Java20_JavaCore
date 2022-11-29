package Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ExerciseNo13 {
    public ExerciseNo13() {
        System.out.print("Nhập vào số phần tử: ");
        Scanner sc = new Scanner(System.in);
        int arrayLength = sc.nextInt();
        ArrayList<Double> list = new ArrayList<>();

        for (int i = 0; i < arrayLength; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + " : ");
            list.add(sc.nextDouble());
        }
        //a. Gia tri trung binh
        double avgResult = 0.0;
        double maxNumber = 0;
        double minNumber = 0;
        double negMaxNumber = 0;
        double negMinNumber = 0;
        double posMaxNumber = 0;
        double posMinNumber = 0;

        boolean firstNeg = true;
        boolean firstPos = true;

        List<Integer> oddList = new ArrayList<>();
        List<Integer> evenList = new ArrayList<>();

        for (int i = 0; i < list.toArray().length; i++) {
            avgResult += list.get(i);
            if (minNumber > list.get(i)) {
                minNumber = list.get(i);
            }
            if (maxNumber < list.get(i)) {
                maxNumber = list.get(i);
            }

            if (list.get(i) < 0 && firstNeg) {
                firstNeg = false;
                negMaxNumber = list.get(i);
            }

            if (list.get(i) > 0 && firstPos) {
                firstPos = false;
                posMinNumber = list.get(i);
            }
            if (list.get(i) < 0) {
                if (negMinNumber > list.get(i)) {
                    negMinNumber = list.get(i);
                }
                if (negMaxNumber < list.get(i)) {
                    negMaxNumber = list.get(i);
                }
            }

            if (list.get(i) > 0) {
                if (posMinNumber > list.get(i)) {
                    posMinNumber = list.get(i);
                }
                if (posMaxNumber < list.get(i)) {
                    posMaxNumber = list.get(i);
                }
            }

            //Giá trị chẵn lẻ
            if (list.get(i) % 2 == 0) {
                int addEvenNumber = list.get(i).intValue();
                evenList.add(addEvenNumber);
            } else if (list.get(i) % 2 != 0) {
                int addOddNumber = list.get(i).intValue();
                oddList.add(addOddNumber);
            }
        }
        avgResult = avgResult / (list.toArray().length);
        System.out.printf("\na/ Giá trị trung bình : %.3f", avgResult);

        //b. Giá trị lớn nhất, nhỏ nhất
        System.out.printf("b/ Giá trị lớn nhất: %.2f", maxNumber);
        System.out.printf("\n   Giá trị nhỏ nhất: %.2f", minNumber);

        //c. Phần tử âm lớn nhất, nhỏ nhất
        System.out.printf("\nc/ Phần tử âm có giá trị lớn nhất: %.2f", negMaxNumber);
        System.out.printf("\n   Phần tử âm có giá trị nhỏ nhất: %.2f", negMinNumber);

        //d. Phần tử dương lớn nhất, nhỏ nhất
        System.out.printf("\nd/ Phần tử dương có giá trị lớn nhất: %.2f", posMaxNumber);
        System.out.printf("\n   Phần tử dương có giá trị nhỏ nhất: %.2f", posMinNumber);

        //e. In ra các phần tử chẵn lẻ
        System.out.print("\ne/ Các phần tử chẵn: " + evenList);
        System.out.print("\n   Các phần tử lẻ: " + oddList);

        //f. Thêm phần tử theo index
        System.out.println("\nf/ Mảng hiện tại: " + list);
        System.out.print("   Nhập vào vị trí cần thay đổi giá trị: ");
        int indexAdd = sc.nextInt();
        System.out.print("   Nhập vào giá trị chèn vào: ");
        double addNumber = sc.nextDouble();

        Double[] newList = new Double[list.size() + 1];
        while (indexAdd > list.toArray().length) {
            System.out.println("   Nhập lại vị trí cần index: ");
            indexAdd = sc.nextInt();
        }
        for (int i = 0; i < list.toArray().length + 1; i++) {
            if (i < indexAdd) {
                newList[i] = list.get(i);
            }
            if (i == indexAdd) {
                newList[i] = addNumber;
            } else if (i > indexAdd) {
                newList[i] = list.get(i - 1);
            }
        }

        System.out.println("   Mảng sau khi chèn vào tại vị trí " + indexAdd + " : " + Arrays.stream(newList).toList());

        //g. Xoá phần tử tại vị trí
        System.out.println("\ng/ Mảng hiện tại: " + list);
        System.out.print("   Nhập vào vị trí cần xoá giá trị: ");
        int indexRemove = sc.nextInt();

        Double[] removeList = new Double[list.size() - 1];
        while (indexAdd > list.toArray().length) {
            System.out.println("   Nhập lại vị trí cần index: ");
            indexRemove = sc.nextInt();
        }
        for (int i = 0; i < list.toArray().length - 1; i++) {
            if (i < indexRemove) {
                removeList[i] = list.get(i);
            } else {
                removeList[i] = list.get(i + 1);
            }
        }

        System.out.println("   Mảng sau khi xoá tại vị trí " + indexRemove + " : " + Arrays.stream(removeList).toList());
    }
}
