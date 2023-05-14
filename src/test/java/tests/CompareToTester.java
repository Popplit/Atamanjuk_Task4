package tests;

import org.junit.jupiter.api.Test;

import static org.example.StringOperations.randomString;

// Код класса CompareToTester для пункта 4.2
public class CompareToTester {

    // Метод test тестирует метод compareTo на двух случайно сгенерированных строках 1000 раз.
    // Метод не возвращает никаких значений.
    // В данном методе используется метод randomString, генерирующий случайную строку согласно своим входным параметрам.
    // Метод compareTo сравнивает строки лексикографически, поэтому, если две случайные строки равны, то compareTo
    // вернёт целочисленное значение 0, в этом случае будет выявляться сообщение об успешном тесте и его номере, в ином случае -
    // о проваленном тесте.
    @Test
    void test() {
        for (int i = 1; i <= 1000; i++) {
            String randStr1 = randomString(2, true, true);
            String randStr2 = randomString(2, true, true);
            int result = randStr1.compareTo(randStr2);
            if (result == 0) {
                System.out.println("---------test " + i + " is successful");
            }
            else {
                System.err.println("---------test " + i + " is invalid");
            }
        }
    }
}
