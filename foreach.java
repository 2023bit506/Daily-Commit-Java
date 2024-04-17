// public class foreach {
//     static void a1() {
//         clrscr();
//         System.out.println("Hiii");
//     }

//     static void a2() {
//         clrscr();
//         System.out.println("Hello");
//     }

//     static void a3() {
//         clrscr();
//         System.out.println("Hiii");
//     }

//     public static void main(String[] args) {
//         a1();
//         a2();
//         a3();

       
//     }
//     public static void clrscr() {
//         try{
//         Thread.sleep(3000);
//         }
//         catch(Exception e)
//         {

//         }
//         System.out.println("\033[H\033[2J");
//     }


// }

// public class foreach
// {
//     public void divide(double divident, double divisor) throws ArithmeticException
//     {
//         if (divisor == 0) 
//         {
//             throw new ArithmeticException("Cannot divide by zero");    
//         }
//         else
//         {
//             double result = divident / divisor;
//             System.out.println(result);
//         }
//     }
//     public static void main(String[] args) 
//     {
//        foreach f1 = new foreach();
//        f1.divide(10, 0);
//     }

// }
// public class foreach
// {
//     public static void main(String[] args) {
//     //    String s1 = null;
//     //    System.out.println(s1.length());

//         // String s1 = "abcd";
//         // Integer a = Integer.parseInt(s1);
//         // System.out.println(a);

//         // // int[] a = new int[5];
//         // // System.out.println(a[10]);

//         // String s1 = "Hii";
//         // Character s2 = s1.charAt(5);
//         // try{}

//         try{
            
//         }
//         catch(Exception e){
//             try
//         {

//         }
//         catch(Exception e){

//         }
//         }
        
        
//     }
// }


// interface e1
// {
//      abstract void display();
// }
// public class foreach implements e1
// {
//     public void display()
//     {
//         System.out.println("Hello");
//     }
//     public static void main(String[] args) {
//         foreach f1 = new foreach();
//         f1.display();
//     }
// }

// interface e1
// {
//     default void display()
//     {
//         System.out.println("Hello");
//     }
// }
// interface e2
// {
//     default void display()
//     {
//         System.out.println("Hello2");
//     }
// }
// class foreach implements e1, e2{
//     public void display()
//     {
//         e2.super.display();
//     }

//     public static void main(String[] args) {
//         foreach f1 = new foreach();
//         f1.display();
//     }
   
// }

/*class foreach2
{
    void vehicle()
    {
        System.out.println("I am vehicle");
    }
}
class foreach1 extends foreach2
{
    void car()
    {
        System.out.println("I am car");
    }
}
class foreach3 extends foreach1
{
    void bolero()
    {
        System.out.println("I am bolero");
    }

}
public class foreach
{
    public static void main(String[] args) {
        foreach3 f1 = new foreach3();
        f1.vehicle();
        f1.car();
        f1.bolero();
    }
} */


// class foreach
// {
//     private int a = 10;
//     private void display()
//     {
//         System.out.println(a);
//     }
//     class Inner
//     {
//         public Inner()
//         {
//             System.out.println("Inner class constructor");
//             System.out.println(a);
//             display();
//         }
//     }

//     public static void main(String[] args) {
//         foreach f1 = new foreach();
//         foreach.Inner obj = f1.new Inner();
//         f1.display();
//     }
// }

// class foreach
// {
//     private static int a = 10;
//     private static void show()
//     {
//         System.out.println(a);
//     }
//     static class Inner{
//         Inner()
//         {
//             System.out.println("Hello");
//             show();
//             System.out.println(a);
//         }
//     }
//     public static void main(String[] args) {
//         foreach.Inner obj = new foreach.Inner();
//     }
// }

// abstract class foreach1
// {
//     protected abstract void show();
//     protected void display()
//     {
//         System.out.println("Shubham");
//     }
// }
// public class foreach extends foreach1
// {
//     protected void show()
//     {
//         System.out.println("Hello Abstarct Method");
//     }
//     public static void main(String[] args) {
//         foreach1 f1 = new foreach();
//         f1.show();
//         f1.display();
//     }
// }

// interface e1 
// {
//     void show();
//     int a = 10;
// }
// class foreach implements e1
// {
//     public void show()
//     {
//         System.out.println("Hello");
//         System.out.println(a);
//     }
//     public static void main(String[] args) {
//         e1 f1 = new foreach();
//         f1.show();
//     }
// }


public class foreach
{
    int num1 = 2050;
    class Inner{
        int num;
        public Inner(int num)
        {
            this.num = num;
            System.out.println(this.num);
            System.out.println(foreach.this.num1);
        }
    }
    public static void main(String[] args) {
        foreach f1 = new foreach();
        foreach.Inner s2 = f1.new Inner(2056);
    }
}
