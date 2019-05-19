package JavaPractice;

/*
 * @author: mohit5.kumar
 * @created: 20/03/19
 */
public class Main {
    public static double sqrt(int number) {
        double t;

        double squareRoot = number / 2;

        do {
            t = squareRoot;
            squareRoot = (t + (number / t)) / 2;
        } while ((t - squareRoot) != 0);

        return squareRoot;
    }

    public static void main(String[] args) {
        System.out.println(sqrt(16));
    }
}
