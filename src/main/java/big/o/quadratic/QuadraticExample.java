package big.o.quadratic;

/**
 * @author Rubanraj R on 10/08/2021
 */
public class QuadraticExample {
    // O(n^2) - Here the complexity grows exponentially
    public void printNumbers(int[] numbers) {
        for (int first: numbers) {
            for (int second: numbers) {
                System.out.println(first + " - " + second);
            }
        }
    }

    public static void main(String[] args) {
        QuadraticExample qe = new QuadraticExample();
        qe.printNumbers(new int[]{1, 2, 3});
    }
}
