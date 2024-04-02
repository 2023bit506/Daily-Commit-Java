public class printingObject 
{
    public void display()
    {
        int a = 10;
        System.out.println(a+" "+this);
    }
    public String toString()
    {
        // return getClass().getSimpleName()+"@"+Integer.toHexString(hashCode());
        return getClass()+"@"+Integer.toHexString(hashCode());
    }    
    public static void main(String[] args)
    {
        printingObject s1 = new printingObject();
        System.out.println(s1);
        s1.display();
    }
}
