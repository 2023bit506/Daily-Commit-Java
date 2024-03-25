public class nestedClasses2 {
    static int a = 10;
    private String s1 = "Shubham";
    double d = 12.14d;

    class inner2{
        void printData()
        {
            System.out.println(a);
            System.out.println(s1);
            System.out.println(d);
        }
    }

    public static void main(String[] args) {
        nestedClasses2 n2 = new nestedClasses2();
        nestedClasses2.inner2 n3 = n2.new inner2();
        n3.printData();
    }
}
