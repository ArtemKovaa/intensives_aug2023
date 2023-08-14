package ru.yandex.tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Task2SelectionSort {
    public static ArrayList<Integer> sort(ArrayList<Integer> numbers) {
        /*
         * numbers: массив целых чисел, -10^5 <= numbers[i] <= 10^5, длина массива до 10^5
         * Выход: отсортированный (сортировкой выбором!) numbers
         */
        for (int i = 0; i < numbers.size(); i++) {
            int minIndex = i;
            for (int j = i + 1; j < numbers.size(); j++) {
                if (numbers.get(minIndex) > numbers.get(j)) {
                    minIndex = j;
                }
            }
            int temp = numbers.get(minIndex);
            numbers.set(minIndex, numbers.get(i));
            numbers.set(i, temp);
        }
        return numbers;
    }

    public static void selfCheck() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3, 4, 5, 2, 1));
        ArrayList<Integer> output = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        assert output.equals(sort(input));
    }
}
