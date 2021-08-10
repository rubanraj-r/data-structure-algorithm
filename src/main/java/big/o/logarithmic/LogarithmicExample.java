package big.o.logarithmic;

/**
 * @author Rubanraj R on 10/08/2021
 */
public class LogarithmicExample {
    int findNumber(int numberToFind, int[] numbers, int startIndex, int endIndex) {
        // O(log n) - Binary Search is the best example
        if (endIndex >= startIndex) {
            int mid = startIndex + (endIndex - startIndex) / 2;

            // if middle itself
            if (numbers[mid] == numberToFind) return mid;
            // if left side of middle
            if (numbers[mid] > numberToFind) return findNumber(numberToFind, numbers, startIndex, mid - 1);
            // if right side of middle
            if (numbers[mid] < numberToFind) return findNumber(numberToFind, numbers, mid + 1, endIndex);
        }
        return -1;
    }

    public static void main(String[] args) {
        LogarithmicExample le = new LogarithmicExample();
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 8, 10};
        int index = le.findNumber(3,numbers, 0, numbers.length - 1);
        if (index == -1) System.out.println("Element not present in the array");
        else System.out.println("Element present at " + index);
    }
}
