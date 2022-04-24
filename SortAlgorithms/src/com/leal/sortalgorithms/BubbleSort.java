package com.leal.sortalgorithms;

public class BubbleSort {
    public static void sort(int[] intArray) {

        for (int lastUnsortedIndex = intArray.length -1; lastUnsortedIndex > 0; lastUnsortedIndex --) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[i+1]) {
                    Swap.swapElement(intArray, i, i+1);
                }
            }
        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

    }

}
