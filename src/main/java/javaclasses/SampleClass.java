package javaclasses;

/**
 * Created by adamhurwitz on 2/27/16.
 */
public class SampleClass {
    static private final String LOG_TAG = SampleClass.class.getSimpleName();

    public static void main(String[] arg) {
        // swap Array method
        swap(1, 2);
        System.out.println("Answer is: " + swapArray[0] + "|" + swapArray[1] + "|" + swapArray[2]);
    }

    static int[] swapArray = {7, 9, 4};

    public static int[] swap(int indexOne, int indexTwo) {
        int newIndexOne;
        int newIndexTwo;
        newIndexOne = swapArray[indexTwo];
        newIndexTwo = swapArray[indexOne];
        swapArray[indexOne] = newIndexOne;
        swapArray[indexTwo] = newIndexTwo;
        return swapArray;
    }
}
