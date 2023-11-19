package com.kirillbobrov.numberBasedTasks;
/**
 * This is a task number 8 from https://github.com/allicen/Java-1000
 * @author Kirill Bobrov
 * @version { @value 2023_09_13 }
 */
public class Gulliver {
    /**
     * Сalculate how many mattresses the Lilliputians need.
     * 
     * @param k a coefficient reflecting how many times Gulliver is bigger than Lilliputians
     * @param m the number of mattress layers
     * @return  number of mattresses
     */
    public static int bed(int k, int m) {
        return (k * k * m);
    }
    public static void main(String[] args) {
        System.out.println(bed(2, 2));
        System.out.println(bed(12, 4));
    }
    
}
