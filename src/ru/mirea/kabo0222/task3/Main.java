package ru.mirea.kabo0222.task3;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        float s = 0f;
        float sr_ar = 0f;
        for (int b = 0; b < a.length; b++) {
            s = s + a[b];
        }
        System.out.println("Сумма:" + s);
        System.out.println("Среднее арифметическое:" + (s/a.length));
    }
}