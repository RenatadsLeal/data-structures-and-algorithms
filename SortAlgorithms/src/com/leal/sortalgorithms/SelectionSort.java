package com.leal.sortalgorithms;

public class SelectionSort {

    public static void sort(int[] intArray) {

        for(int lastUnsortedIndex = intArray.length -1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largest = 0;

            for(int i = 1; i <= lastUnsortedIndex; i++) {
                if(intArray[i] > intArray[largest]) {
                    largest = i;
                }
            }
            Swap.swapElement(intArray, largest, lastUnsortedIndex);
        }

        for(int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
}
