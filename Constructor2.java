public class Constructor2 
{
    Constructor2()
    {
        this(5);
    }
    Constructor2(int x)
    {
        this();
    }
    public static void main(String[] args) {
        Constructor2 obj = new Constructor2();
    }
}


//Constructor2.java:3: error: recursive constructor invocation