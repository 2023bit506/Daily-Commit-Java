public class exampleStatic {
    static int a = 20;
    static{
        System.out.println("Hello SGGS");
        a = 56;
    }
    public String toString()
    {
        return "SPP";
    }
    public static void main(String[] args) {
        System.out.println("OUTPUT");
        exampleStatic obj = new exampleStatic();
        System.out.println(obj);
    }
    static{
        System.out.println("Hello Shubham");
        a=90;
    }
    {
        System.out.println("ABCD");
        System.out.println(a);
    }
}
