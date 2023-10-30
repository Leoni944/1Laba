package ru.mirea.kabo0222.task6;
public class Main {
    public static void main(String[] args) {
        System.out.println("Первые 10 чисел гармонического ряда: ");
        for (int i = 1; i <= 10; i++) {
            double hn = 1.0 / i;
            System.out.format("%.2f%n", hn);
        }
    }
}