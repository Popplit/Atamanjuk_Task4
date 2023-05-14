package org.example;

import java.util.Random;

import static java.lang.Math.min;
import static org.example.StringOperations.randomString;
import static org.example.StringOperations.stringComparison;

public class Main {
    public static void main(String[] args) {
        // Проверка основной задачи 4
        System.out.println("Задача 4:");
        String strOne = "AECACEC";
        String strTwo = "AECACA";
        stringComparison(strOne, strTwo); // Первая строка больше второй на 4
        strOne = "AECAA";
        strTwo = "AECADA";
        stringComparison(strOne, strTwo); // Первая строка меньше второй на -3
        strOne = "AECAA";
        strTwo = "AECAA";
        stringComparison(strOne, strTwo); // Строки равны
        strOne = "AECAA";
        strTwo = "AECAAC";
        stringComparison(strOne, strTwo); // Первая строка достигла конца
        strOne = "AECAAC";
        strTwo = "AECAA";
        stringComparison(strOne, strTwo); // Вторая строка достигла конца

        // Проверка пункта 4.1
        System.out.println("Пункт 4.1:");
        System.out.println(randomString(10, true, true)); // И латинские буквы, и числа
        System.out.println(randomString(10, true, false)); // Только латинские буквы
        System.out.println(randomString(10, false, true)); // Только числа
        System.out.println(randomString(10, false, false)); // Хотя бы один параметр должен быть true
    }
}

