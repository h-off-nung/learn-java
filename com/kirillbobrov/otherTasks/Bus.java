package com.kirillbobrov.otherTasks;
import java.util.Arrays;
import java.util.Scanner;

/**
 * This is a task number 65 from https://github.com/allicen/Java-1000 
 * @author Kirill Bobrov
 */
public class Bus {
    private static String[] letters = {"A", "B", "C", "E", "H", "K", "M", "O", "P", "T", "X", "Y"};
    private static String[] numbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

    public static void checkNumber(String[] nums) {
        for (int i = 0; i < nums.length; i++) {
            String[] busNum = nums[i].split("");
            System.out.println("Results:");
            if (!(Arrays.asList(letters).contains(busNum[0])) || !(Arrays.asList(letters).contains(busNum[4])) || !(Arrays.asList(letters).contains(busNum[5]))) {
                System.out.println("No");
                continue;
            }
            if (!(Arrays.asList(numbers).contains(busNum[1])) || !(Arrays.asList(numbers).contains(busNum[2])) || !(Arrays.asList(numbers).contains(busNum[3]))) {
                System.out.println("No");
                continue;
            }
            System.out.println("Yes");
    }
        }
        
    public static String[] typeIn() {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter the number of signs: ");
            int size = scan.nextInt();
            String[] nums = new String[size];
            scan.nextLine();
            for (int j = 0; j < size; j++) {
                System.out.print("Enter the sign: ");
                nums[j] = scan.nextLine();
            }
            return nums;
        }
    }

    public static void main(String[] args) {
        checkNumber(typeIn());
    }

}
