package Exercises;

import java.util.Scanner;

public class ExerciseNo22 {
    public ExerciseNo22() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String str = sc.nextLine();
        int index = 0;
        int indexStart = 0;
        int indexEnd = 0;
        String subStr = "";

        for (int i = 0; i < str.length()-1; i++){
            if (str.charAt(i)==str.charAt(i+1)){
                index = i;
                System.out.println(index);
                for(int k = 0; k < (str.length()/2-1); k++){
                    if (str.charAt(index-k)!=str.charAt(index+k+1)){
                        indexStart = index-k+1;
                        indexEnd = index+k;
                    }
                }
            }
        }
        System.out.println(subStr.substring(indexStart,indexEnd));
    }
}
