public class printEvenIndexFromArray {

    public void displayEvenNumbers(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(i%2==0)
            {
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        printEvenIndexFromArray e1 = new printEvenIndexFromArray(); 
        int[] arr = {1,2,3,4,5,6};
        e1.displayEvenNumbers(arr);

    }
}
