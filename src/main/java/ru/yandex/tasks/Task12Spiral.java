package ru.yandex.tasks;

import java.util.Arrays;

public class Task12Spiral {
    public static int[][] draw(int N) {
        /*
         * Отрисовывает "спираль" в двумерном массиве по часовой стрелке
         * -10^3 <= N <= 10^3
         * Выход: массив со спиралью
         */
        var result = new int[N][N];
        int top = 0;
        int left = 0;
        int bottom = N - 1;
        int right = N - 1;
        int acc = 1;
        while (top <= bottom || left <= right) {
            for (int i = left; i <= right; i++) {
                result[top][i] = acc++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                result[i][right] = acc++;
            }
            right--;
            for (int i = right; i >= left; i--) {
                result[bottom][i] = acc++;
            }
            bottom--;
            for (int i = bottom; i >= top; i--) {
                result[i][left] = acc++;
            }
            left++;
        }
        return result;
    }

    public static void selfCheck() {
        int[][] output = {
                {1, 2, 3, 4, 5, 6, 7},
                {24, 25, 26, 27, 28, 29, 8},
                {23, 40, 41, 42, 43, 30, 9},
                {22, 39, 48, 49, 44, 31, 10},
                {21, 38, 47, 46, 45, 32, 11},
                {20, 37, 36, 35, 34, 33, 12},
                {19, 18, 17, 16, 15, 14, 13}
        };

        assert Arrays.deepEquals(output, draw(7));
    }
}
