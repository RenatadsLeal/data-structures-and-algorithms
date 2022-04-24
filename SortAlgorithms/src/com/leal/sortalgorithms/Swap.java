package com.leal.sortalgorithms;

public class Swap {

    public static void swapElement(int[] array, int firstIndex, int secondIndex) {

        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;

    }

}
