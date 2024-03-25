public class methodLocalInnerClass {
    private int a = 20;

    void display() {
        String s1 = "Shubham";
        class Local {
            double d = 45.77d;
            void msg() {
                System.out.println("Hello I am Local Class");
                System.out.println(a);
                System.out.println(s1);
                System.out.println(d);
            }
        }
        Local l1 = new Local();
        l1.msg();

    }

    public static void main(String[] args) {
        methodLocalInnerClass obj = new methodLocalInnerClass();
        obj.display();
    }

}
