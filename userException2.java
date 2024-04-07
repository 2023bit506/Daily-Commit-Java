public class userException2 {
    public static void main(String[] args) {
        
        try{
        int arr[] = new int[10];
        System.out.println(arr[15]);
        }
        catch(Exception e)
        {
            System.out.println("ArrayIndexOutOfBounds Exception");
        }
    }
}
