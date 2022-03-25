package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] arrayOfNumbers = new int[3];
        arrayOfNumbers[0] = 2386203;
        arrayOfNumbers[1] = 7416803;
        arrayOfNumbers[2] = 2710524;

        System.out.println("Введите номер для звонка");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        Barrier barrier1 = new Barrier(checkNumber(number, arrayOfNumbers));
        System.out.println("Состояние барьера " + barrier1.getBarrier());
    }

    public static boolean checkNumber(int number, int[] arrayOfNumbers) {
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            if (arrayOfNumbers[i] == number) {
                return true;
            }
        }
        return false;
    }
}
