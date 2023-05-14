package org.example;

import java.util.Random;

import static java.lang.Math.min;

// Класс для работы со строками
public class StringOperations {

    // Код метода для основной задачи 4
    // Метод stringComparison лексикографически сравнивает две строки между собой.
    // Входными параметрами данного метода являются две строки: word1 и word2.
    // Метод возвращает целочисленное значение.
    // В методе происходит сначала поиск наименьшего количества символов среди двух строк minLength.
    // Далее происходит линейный поиск в диапазоне minLength, где по индексу i сравниваются символы word1 и word2.
    // Если символ word1 и word2 под индексом i не совпадают, то происходит разность между ASCII значениями
    // символов word1 и word2 под индексом i, после чего данное значение выводится в консоль и метод завершается.
    // Если в диапазоне minLength не было найдено не схожих между собой символов в word1 и word2,
    // то метод продолжается и происходит условие, проверяющее какая строка по количеству символов короче другой.
    // Если короче word1, то выводится результат -1. Если короче word2, то 1. Если строки равны, то 0.
    public static int stringComparison(String word1, String word2) {
        int minLength = min(word1.length(), word2.length());
        for (int i = 0; i < minLength; i++) {
            if (word1.charAt(i) != word2.charAt(i)) {
                int value = (int) word1.charAt(i) - (int) word2.charAt(i);
                return value;
            }
        }
        if (word1.length() < word2.length()) {
            return -1;
        } else if (word1.length() > word2.length()) {
            return 1;
        } else {
            return 0;
        }
    }

    // Код метода для пункта 4.1
    // Метод randomString генерирует строку случайных символов длинной n, основываясь на двух индикаторах f и k.
    // Входными параметрами являются: целое число n и две булевые переменные f и k.
    // Метод возвращает значение в формате строки (String).
    // Целое число n означает количество символов в генерируемой строке.
    // Параметр f отвечает за наличие латинских букв в генерируемой строке.
    // Параметр k отвечает за наличие чисел в генерируемой строке.
    // Если f = true и k = true, то строка содержит и латинские буквы, и числа.
    // Если f = true и k = false, то строка содержит только латинские буквы.
    // Если f = false и k = true, то строка содержит только числа.
    // Если f = false и k = false, то метод возвращает строку, сообщающую о том, что нужно иметь хотя бы один параметр = true.
    public static String randomString(int n, boolean f, boolean k) {
        if (!f & !k) {
            return "Хотя бы один параметр должен быть true";
        }
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String nums = "0123456789";
        Random r = new Random();
        String output = "";
        if (f & !k) {
            for (int i = 0; i < n; i++) {
                output += alphabet.charAt(r.nextInt(alphabet.length()));
            }
        } else if (!f & k) {
            for (int i = 0; i < n; i++) {
                output += nums.charAt(r.nextInt(nums.length()));
            }
        } else if (f & k) {
            for (int i = 0; i < n; i++) {
                Random numOrAlphabet = new Random();
                if (numOrAlphabet.nextBoolean()) {
                    output += nums.charAt(r.nextInt(nums.length()));
                } else {
                    output += alphabet.charAt(r.nextInt(alphabet.length()));
                }
            }
        }
        return output;
    }
}
