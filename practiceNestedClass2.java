public class practiceNestedClass2 {
    int a = 10;
    String s1 = "Shubham";
    private int b = 45;

    public void display()
    {
        System.out.println(a);
        System.out.println(s1);
        System.out.println(b);
    }

    class Inner3{
        Inner3()
        {
            display();
        }
    }
    
    
    public static void main(String[] args) {
        practiceNestedClass2 p1 = new practiceNestedClass2();
        practiceNestedClass2.Inner3 p2 = p1.new Inner3();

    }
}
