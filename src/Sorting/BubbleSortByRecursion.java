package Sorting;

public class BubbleSortByRecursion {
    void bubbleSort(int[] array,int size) {
        if (size == 1)
            return;
        for (int i = 0; i < size - 1; i++) {
            if (array[i] > array[i + 1]) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }
        bubbleSort(array,size-1);
    }
    void display(int[] array){
        for(int i=0;i<array.length;i++)
            System.out.println(array[i]);
    }
    public static void main(String[] args) {
        BubbleSortByRecursion bubbleSortByRecursion=new BubbleSortByRecursion();
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        int size=arr.length;
        bubbleSortByRecursion.bubbleSort(arr,size);
        bubbleSortByRecursion.display(arr);
    }
}
