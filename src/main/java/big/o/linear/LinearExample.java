package big.o.linear;

/**
 * @author Rubanraj R on 10/08/2021
 */
public class LinearExample {
    public void printNumbers(int[] numbers) {
        // O(n) - Time taken is depends on the length of the numbers array
        for (int i : numbers) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        LinearExample le = new LinearExample();
        le.printNumbers(new int[]{1, 2, 3});
    }
}
