package com.kirillbobrov.numberBasedTasks;
import java.util.Scanner;
/**
 * This is a task number 82 from https://github.com/allicen/Java-1000
 * @author Kirill Bobrov
 * @version { @value 2023_09_23 }
 */
public class Rally {
    /**
     * Return the name of the karting winner
     * @param n number of participants
     * @param m number of laps in the race
     * @return the winner's name
     */
    public static String winner(int n, int m) {
        String[] names = new String[n];
        int[][] results = new int[n][m];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            names[i] = scan.nextLine();
            for (int j = 0; j < m; j++) {
                results[i][j] = scan.nextInt();
                scan.nextLine();
            }
                
        }
        int max = 0, now = 0, num = 0;
        for (int k = 0; k < n; k++) {
            now = 0;
            for (int j = 0; j < m; j++) {
                now += results[k][j];
            }
            if (max < now) {
                max = now;
                num = k;
            }
        }
        scan.close();
        return names[num];
    }
    public static void main(String[] args) {
        System.out.printf("Winner is %s!", winner(2, 2));
    }
}
