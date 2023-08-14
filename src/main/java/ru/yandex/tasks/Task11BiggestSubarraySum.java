package ru.yandex.tasks;

public class Task11BiggestSubarraySum {

    public static Subarray find(int[] numbers) {
        /*
         * Находит подмассив (подряд идущие элементы массива) с наибольшей суммой элементов
         * numbers: массив целых чисел, -10^5 <= numbers[i] <= 10^5, длина массива до 10^5
         * Выход: Subarray
         */
        var result = new Subarray();
        var left = 0;
        var max = numbers[0];
        var curSum = numbers[0];
        for (int right = 1; right < numbers.length; right++) {
            curSum += numbers[right];
            if (numbers[right] >= max) {
                max = numbers[right];
                left = right;
            }
            if (max <= curSum) {
                max = curSum;
                result.left = left;
                result.right = right + 1;
            }
        }
        return result;
    }

    public static void selfCheck() {
        int[] output = {1, 2, -5, 7, -1, 6};
        Subarray ans = find(output);

        assert ans != null;
        assert (ans.left == 3 && ans.right == 6);
    }
}
