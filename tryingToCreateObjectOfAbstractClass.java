// abstract public class tryingToCreateObjectOfAbstractClass {
//     public static void main(String[] args) {
//         tryingToCreateObjectOfAbstractClass s1 = new tryingToCreateObjectOfAbstractClass();
//     }
// }

interface e1 {
    default void display()
    {
        System.out.println("ABCD1");
    }
}

interface e2 {
    default void display()
    {
        System.out.println("ABCD2");
    }
}

class MClass implements e1, e2 {
    public void display()
    {
        // System.out.println("ABCD2");
        e1.super.display();
    }
    
}

public class tryingToCreateObjectOfAbstractClass {
    public static void main(String[] args) {
        MClass e1 = new MClass();
        e1.display();

    }
}