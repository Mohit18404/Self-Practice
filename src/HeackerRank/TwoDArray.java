package HeackerRank;

import java.util.Scanner;

/*
 * @author: mohit5.kumar
 * @created: 14/03/19
 */
public class TwoDArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            for(int l=0;l<4;l++){
                int sum = 0;
                int mid = 0;
                for (int j = l; j <=2 + l; j++) {
                    sum = sum + arr[l][j];
                    mid = j + 1;
                }
                int k = i;
                sum = sum + arr[k + 1][mid - 2];
                for (int j = i; j <=2+i; j++) {
                    sum = sum+arr[i + 2][j+k];
                }
                if (max < sum) max = sum;
            }
        }
        System.out.println(max);

        scanner.close();
    }
}
