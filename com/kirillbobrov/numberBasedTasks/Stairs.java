package com.kirillbobrov.numberBasedTasks;

/**
 * This is the task number 111 from https://github.com/allicen/Java-1000/tree/master/stairs.
 * @author Kirill Bobrov
 * @version { @value 2023_11_19 }
 */
public class Stairs {
    /**
     * 
     * @param cubes is the number of cubes to create a stairs
     * @return the highest step of the stairs
     */
    public static int lastStep(int cubes) {
        int n = 0;
        int step = 0;
        while (n < cubes) {
            step++;
            n += step;
        }
        if (n > cubes) {
            return step - 1;
        }
        return step;
    }

    public static void main(String[] args) {
        System.out.println(lastStep(1));
        System.out.println(lastStep(4));
        System.out.println(lastStep(6));
        System.out.println(lastStep(13));
    }
}
