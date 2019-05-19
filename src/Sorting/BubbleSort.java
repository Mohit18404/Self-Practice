package Sorting;

public class BubbleSort {
    void bubbleSort(int[] array){
        for (int i=0;i<array.length-1;i++){
            int flag=0;
            for (int j=0;j<array.length-i-1;j++){
                if(array[j]>array[j+1]) {
                    flag=1;
                    int temp =array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
            if(flag==0)
                break;
        }
    }
    void diplay(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
    public static void main(String[] args) {
        BubbleSort bubbleSort=new BubbleSort();
        int[] array={64, 34, 25, 12, 22, 11, 90};
        bubbleSort.bubbleSort(array);
        bubbleSort.diplay(array);
    }
}
