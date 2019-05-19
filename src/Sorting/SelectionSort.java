package Sorting;

public class SelectionSort {
    void selectionSort(int[] arrays) {
        for (int i = 0; i < arrays.length - 1; i++) {
            int minimum = i;
            for (int j = i + 1; j < arrays.length; j++)
                if (arrays[minimum] > arrays[j])
                    minimum = j;
                int temp = arrays[minimum];
                arrays[minimum] = arrays[i];
                arrays[i] = temp;
        }
    }

    void display(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        int[] array = {64, 25, 12, 22, 11};
        selectionSort.selectionSort(array);
        selectionSort.display(array);
    }
}
