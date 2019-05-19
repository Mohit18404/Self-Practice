package interviewBit.Array;

/*
 * @author: mohit5.kumar
 * @created: 21/04/19
 */
public class Print2DSpiralOrder {
    public static void method(int[][] arr){
        int right=0;
        int left=arr.length;
        int top=0;
        int bottom=arr.length;
        for(int i=0;i<arr.length/2+1;i++){
            for (int j=right;j<left;j++) System.out.print(arr[right][j]+" ");
            for (int j=top;j<bottom-1;j++) System.out.print(arr[j+1][bottom-1]+" ");
            for (int j=left-1;j>right;j--) System.out.print(arr[left-1][j-1]+" ");
            for (int j=bottom-1;j>top+1;j--) System.out.print(arr[j-1][top]+" ");
            right=right+1;
            top=top+1;
            left=left-1;
            bottom=bottom-1;
        }

    }

    static void method1(int[][] arr){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        method(arr);
        System.out.println();
        method1(arr);
    }
}
