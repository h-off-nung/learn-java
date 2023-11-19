package com.kirillbobrov.numberBasedTasks;

/**
 * This is a task number 78 from https://github.com/allicen/Java-1000
 * @author Kirill Bobrov
 * @version 16.09.2023
 */
public class TwoRings {
    /**
     * Calculate if two rings have at least one common point.
     * @param ring1 x, y coordinates and radius of the first ring
     * @param ring2 x, y coordinates and radius of the second ring
     * @return "YES" or "NO"
     */
    public static String commonPoint(int[] ring1, int[] ring2) {
        int x1 = ring1[0], y1 = ring1[1], r1 = ring1[2];
        int x2 = ring2[0], y2 = ring2[1], r2 = ring2[2];
        if ((x1 + r1 >= x2 - r2) && (y1 + r1 >= y2 - r2)) {
            return ("YES");
        }
        return ("NO");
    }
    public static void main(String[] args) {
        int[] ring1 = {1, 1, 1};
        int[] ring2 = {10, 1, 30};
        System.out.println(commonPoint(ring1, ring2));
    }
}
