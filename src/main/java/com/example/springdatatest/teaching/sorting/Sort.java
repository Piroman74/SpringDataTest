package com.example.springdatatest.teaching.sorting;

public class Sort {
    // bubbleSort
    public int[] innerSort(int[] integers) {
        for (int i = 0; i < integers.length - 1; i++) {
            for (int j = 1; j < integers.length - 1; j++) {
                if (integers[i] > integers[j]) {
                    integers[i] = integers[j];
                    integers[j] = integers[i];
                }
            }
        }
        return integers;
    }

    public static void bubbleSort(int[] sortArr) {
        for (int i = 0; i < sortArr.length - 1; i++) {
            for (int j = 0; j < sortArr.length - i - 1; j++) {
                if (sortArr[j] > sortArr[j + 1]) {
                    int swap = sortArr[j];

                    sortArr[j] = sortArr[j + 1];
                    sortArr[j + 1] = swap;
                }
            }
        }
    }


}

class Test {
    public static void main(String[] args) {
        Sort sort = new Sort();
        int[] ints = {2, 1, 53, 12, 123, 5};

        Sort.bubbleSort(ints);
        for (int i : ints) {
            System.out.println(i);
        }
    }
}
