package ru.mirea.kabo0222.task4;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int max = 0;
        int min;
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        int i = 0;

        System.out.println("Введите элементы массива:");
        while (i < 10) {
            array[i] = scanner.nextInt();
            sum = sum + array[i];
            i++;
        }

        System.out.println("Сумма:" + sum);

        max = array[0];
        min = array[0];

        for (int l = 0; l < array.length; l++) {
            if (array[l] > max) {
                max = array[l];
            }
            if (array[l] < min) {
                min = array[l];
            }
        }

        System.out.println("Максимальный элемент массива: " + max);
        System.out.println("Минимальный элемент массива: " + min);
    }
}