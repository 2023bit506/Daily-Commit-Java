public class exceptionHandling5 
{
    public static void main(String[] args) {
        try
        {
            int arr[] = new int[5];
            arr[5] = 30/0;
            System.out.println(arr[10]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception Occured");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBounds Exception Occured");    
        }
        catch(Exception e)
        {
            System.out.println("Parent Exception Occurs");
        }
        System.out.println("Rest of code");
    }    
}
