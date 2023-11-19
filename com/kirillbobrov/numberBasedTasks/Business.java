package com.kirillbobrov.numberBasedTasks;

/**
 * @author Kirill Bobrov
 */
public class Business {
    // Sort an array with the Bubble method
    public static void bubbleSort(int[] sortArr){
        for (int i = 0; i < sortArr.length - 1; i++) {
            for(int j = 0; j < sortArr.length - i - 1; j++) {
                if(sortArr[j + 1] < sortArr[j]) {
                    int swap = sortArr[j];
                    sortArr[j] = sortArr[j + 1];
                    sortArr[j + 1] = swap;
                }
            }
        }
    }
    
    public static int buyCars(int num, int price, int[] cars) {
        bubbleSort(cars);
        int budget = price;
        int buy = 0;
        for (int i = 0; i < num; i++) {
            budget -= cars[i];
            if (budget >= 0) {
                buy++;
            }
            else {
                break;
            }
        }
        return buy;
        }

    public static void main(String[] args) {
        int test_one = buyCars(6, 12, new int[]{2, 1, 6, 2, 4, 3});
        int test_two = buyCars(5, 30, new int[]{15, 5, 11, 10, 12});
        int test_three = buyCars(6, 18, new int[]{5, 10, 1, 2, 1, 20});
        System.out.printf("You can buy %d cars.\n", test_one);
        System.out.printf("You can buy %d cars.\n", test_two);
        System.out.printf("You can buy %d cars.\n", test_three);
    }
}
