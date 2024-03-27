public class printAllElementsInArrayInNewLine
{
    public static void display(int[] arr)
    {
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args)
    {
        int[] arr = {10,20,30,40,50,60};
        printAllElementsInArrayInNewLine.display(arr);
    }
}