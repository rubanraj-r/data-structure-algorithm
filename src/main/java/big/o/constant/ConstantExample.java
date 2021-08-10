package big.o.constant;

/**
 * @author Rubanraj R on 10/08/2021
 */
public class ConstantExample {
    // O(1) - Always takes the same amount of time to process the operation
    public void printNumbers(int[] numbers) {
        System.out.println(numbers[0]);
    }

    public static void main(String[] args) {
        ConstantExample ce = new ConstantExample();
        ce.printNumbers(new int[]{1, 2, 3});
    }
}
