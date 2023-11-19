package com.kirillbobrov.numberBasedTasks;

import java.util.Arrays;
import java.util.Scanner;

/**
 * This is a task number 32 from https://github.com/allicen/Java-1000
 * @author Kirill Bobrov
 * @version { @value 2023_09_13 }
 */
public class Machines {
    /**
     * Calculate the non-triviality of the i-th machine. 
     * @return
     */
    public static int[] nontriviality() {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int[] nums = new int[k];
        for (int i = 0; i < k; i++) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            nums[i] = 9 * m + (n + 239)*(n + 366) / 2;
        }
        scan.close();
        return nums;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(nontriviality()));
    }
}