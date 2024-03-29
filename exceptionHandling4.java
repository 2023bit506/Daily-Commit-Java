public class exceptionHandling4 
{
    public static void main(String[] args) {
        try
        {
            int[] arr = {10,20,30,40};
            System.out.println(arr[5]);
        }
        catch(Exception e)
        {
            System.out.println("Array index out of bounds exception  "+"\n"+e);
        }
    }    
}
