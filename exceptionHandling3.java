public class exceptionHandling3 
{    
    public static void main(String[] args) {
        try{
        
            String s1 = "abc";
            int i = Integer.parseInt(s1);
            System.out.println(i);
        }
        catch(Exception e)
        {
            System.out.println("Number Format Exception");
        }
    }    
}
