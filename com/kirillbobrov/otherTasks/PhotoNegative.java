package com.kirillbobrov.otherTasks;

import java.util.Arrays;
import java.util.Scanner;

/**
 * This is a task number 75 from https://github.com/allicen/Java-1000
 * 
 * @author Kirill Bobrov
 * @version { @value 2023_10_08 }
 */
public class PhotoNegative {
    /**
     * Calculate the number of errors when creating a negative.
     * @return the number of errors
     */
    public static int check() {
        int errors = 0;
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt(); // the number of lines
        scan.nextLine();
        int y = scan.nextInt(); // the number of pixels
        scan.nextLine();
        // Создать двухмерный массив
        String[][] origin = new String[x][y];
        String[][] negative = new String[x][y];
        for (int i = 0; i < x; i++) {
            origin[i] = scan.nextLine().split("");
        }
        System.out.println(Arrays.deepToString(origin).replace("], ", "]\n"));
        scan.nextLine();
        for (int i = 0; i < x; i++) {
            negative[i] = scan.nextLine().split("");
        }
        System.out.println(Arrays.deepToString(negative).replace("], ", "]\n"));
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (origin[i][j].equals(negative[i][j])) {
                    errors++;
                }
            }
        }
        scan.close();
        System.out.println();
        return errors;
    }
    public static void main(String[] args) {
        System.out.printf("You have %d error(s)!", check());
    }
    
}
