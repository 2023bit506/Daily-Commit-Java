public class exceptionHandling7 {
    public static void main(String[] args) {
        try{
            Thread.sleep(500);
            System.out.println("Hello World");
            Thread.sleep(500);
            System.out.println("Hello Shubham");
            System.out.println(args[0]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException Occured at line 8");
        }
        catch(InterruptedException e)
        {
            System.out.println("Interrupt Exception Occured");
        }
    }
}
