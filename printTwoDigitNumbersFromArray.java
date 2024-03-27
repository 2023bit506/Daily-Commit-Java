public class printTwoDigitNumbersFromArray {
    public void displayNumbers(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 9 && arr[i] < 100) {
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        printTwoDigitNumbersFromArray p2 = new printTwoDigitNumbersFromArray();
        int arr[] = {10,20,304,5};
        p2.displayNumbers(arr);
    }
}
