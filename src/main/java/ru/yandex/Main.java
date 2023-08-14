package ru.yandex;

import ru.yandex.tasks.Task1BubbleSort;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Task1BubbleSort.selfCheck();
        System.out.println(Task1BubbleSort.sort(new ArrayList<>(Arrays.asList(3, 4, 5, 2, 1))));
    }
}