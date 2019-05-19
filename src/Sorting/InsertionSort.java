package Sorting;

public class InsertionSort {
    void insertionSort(int[] array){
        for(int i=1;i<array.length;i++){
            int key=array[i];
            int j=i-1;
            while (j>=0 && key<array[j]){
                array[j+1]=array[j];
                j=j-1;
            }
            array[j+1]=key;
        }
    }
    void display(int[] array){
        for (int i=0;i<array.length;i++)
            System.out.println(array[i]);
    }
    public static void main(String[] args) {
        InsertionSort insertionSort=new InsertionSort();
        int[] array={4,3,2,10,12,1,5,6};
        insertionSort.insertionSort(array);
        insertionSort.display(array);
    }
}
