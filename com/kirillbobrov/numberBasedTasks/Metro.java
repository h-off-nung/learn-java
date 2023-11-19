package com.kirillbobrov.numberBasedTasks;

/**
 * This is a task number 65 from https://github.com/allicen/Java-1000
 * @author Kirill Bobrov
 * @version { @value 2023_09_18 }
 */
public class Metro {
    /**
     * Calculate the number of transit stations.
     * @param n number of all stations
     * @param i number of the start station
     * @param j nubmer of the end station
     */
    public static int stations(int n, int i, int j) {
        if (j > i) {
        if (j - i > n + i - j) {
            return n + i - j - 1;
        }
        else{
            return j - i - 1;
        }
        }
        if (j < i) {
        if (i - j > n + j - i) {
            return n + j - i - 1;
        }
        else{
            return i - j - 1;
        }
        }

        return 0;
    }
    public static void main(String[] args) {
        System.out.println(stations(100, 5, 6)); // 0
        System.out.println(stations(15  , 1, 11)); // 4
        System.out.println(stations(10  , 1, 9)); // 1
        System.out.println(stations(4  , 1, 4)); // 0
        System.out.println(stations(4  , 4, 1)); // 0
    }
}
