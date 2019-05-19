package ArrayPractice;

/*
 * @author: mohit5.kumar
 * @created: 18/02/19
 */
import java.util.Arrays;

public class StringArrayAutoIncrement {
    public static void main(String[] args) {
        String[] data = new String[] { "a", "b", "c", "d", "e" };
        String[] array = new String[0];// array initialize with zero
        int incrementLength = 1;
        for (int i = 0; i < data.length; i++) {
            array = Arrays.copyOf(data, i + incrementLength);// increment by +1
        }
        /**
         * values of array after increment
         */
        for (String value : array) {
            System.out.println(value);
        }
    }
}