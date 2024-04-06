public class userException1 {
    public static void checkNum(int num)
    {
        if(num < 1){
            throw new ArithmeticException("\nNumber is negatice, cannot calculate square");

        }
        else
        {
            System.out.println("Square of"+num+"is"+(num*num));
        }
    }

    public static void main(String[] args) {
        userException1 e1 = new userException1();
        e1.checkNum(-5);
        System.out.println("Rest of the code");
    }
}
