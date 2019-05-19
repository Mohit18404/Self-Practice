package HeackerRank;

/*
 * @author: mohit5.kumar
 * @created: 12/03/19
 */
public class SecondLargest {
    public static int secondHighest(int[] array) {
        int n = array.length;
        int maxFirst, maxSecond;
        maxFirst = maxSecond = Integer.MIN_VALUE;
        if (n < 2) {
            return -1;
        }
        boolean allSame = true;
        int lastValue = array[0];

        for (int i = 0; i < n; i++) {
            if (lastValue != array[i]) {
                allSame = false;
            }
            if (array[i] > maxFirst) {
                maxSecond = maxFirst;
                maxFirst = array[i];
            } else if (array[i] > maxSecond && array[i] != maxFirst) {
                maxSecond = array[i];
            }
        }
        if (allSame) return -1;
        else return maxSecond;
    }

    public static void main(String[] args) {
        int[] array = {4,Integer.MIN_VALUE,Integer.MIN_VALUE};
        int max = secondHighest(array);
        System.out.println(max);
    }
}
