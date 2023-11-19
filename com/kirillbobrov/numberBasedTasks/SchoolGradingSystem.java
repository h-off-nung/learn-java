package com.kirillbobrov.numberBasedTasks;

import java.util.Scanner;

/**
 * @author Kirill Bobrov
 */
class SchoolGradingSystem {
    public static String convertNote(byte points) {
        return switch (points) {
            case 0 -> "6";
            case 1 -> "5-";
            case 2 -> "5";
            case 3 -> "5+";
            case 4 -> "4-";
            case 5 -> "4";
            case 6 -> "4+";
            case 7 -> "3-";
            case 8 -> "3";
            case 9 -> "3+";
            case 10 -> "2-";
            case 11 -> "2";
            case 12 -> "2+";
            case 13 -> "1-";
            case 14 -> "1";
            case 15 -> "1+";
            default -> "0";
        };
    }

    public static float gpa(byte[] grades) {
        float average = 0.0f;
        for(int i = 0; i < grades.length; i++) {
            average += grades[i];
        }
        average /= grades.length;
        return average;
    }

    public static byte[] addArray() {
    try (Scanner scan = new Scanner(System.in)) {
        System.out.print("Enter the number of the grades: ");
        byte size = scan.nextByte();
        byte[] myArray = new byte[size];
        System.out.print("Enter the points: ");
        for(byte i = 0; i < size; i++) {
          myArray[i] = scan.nextByte();
            }
        return myArray;
    }
    }

    public static void main(String[] args) {
        System.out.println("Hello student!\n");
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Convert your points into the 6-grade system: ");
            byte points = scan.nextByte();
            String note = convertNote(points);
            System.out.printf("If you have %d points, your note is %s.\n\n", points, note);
        System.out.println("Let's find your GPA. ");
        byte[] notes = addArray();
        float average = gpa(notes);
        System.out.printf("Your grade point average is %.2f.", average);
        }
    }
}