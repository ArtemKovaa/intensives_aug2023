package ru.yandex.tasks;

public class Task8BinarySearch {
    public static int find(int number, int[] sortedList) {
        /*
         * number: целое число, -10^5 <= number <= 10^5
         * numbers: массив целых чисел, 0 <= numbers.length <= 10^5 (числа не повторяются)
         * Выход: i, где numbers[i] = number, -1, если такого i нет
         * Если таких i несколько, вывести наибольший
         */
        int left = 0;
        int right = sortedList.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (sortedList[mid] == number) return mid;
            else if (sortedList[mid] < number) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    public static void selfCheck() {
        int[] input = {1, 3, 5, 7, 9};

        for (int i = 0; i < input.length; i++) {
            assert (find(input[i], input) == i);
        }
    }
}
