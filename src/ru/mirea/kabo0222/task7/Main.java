package ru.mirea.kabo0222.task7;
import java.sql.SQLOutput;
import java.util.*;
public class Main {
    static int factorial(int n){
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res = res * i;
        }
        return res;
    }

    public static void main(String[] args){
        System.out.println(factorial(7));
    }
}