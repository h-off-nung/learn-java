package com.kirillbobrov.numberBasedTasks;

/**
 * This is a task number 34 from https://github.com/allicen/Java-1000
 * @author Kirill Bobrov
 * @version { @value 2023_09_20 }
 */
public class Alarm {
    /**
     * Calculate how many hours proofessor can sleep before alarm clock starts.
     * @param sleep when professor started to sleep
     * @param wake when alarm clock will start
     * @return the number of hours
     */
    public static int hours(int sleep, int wake) {
        if (sleep > wake) {
            return 12 - sleep + wake;
        }
        if (sleep < wake) {
            return wake - sleep;
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(hours(10, 12));
        System.out.println(hours(7, 2));
    }
    
}
