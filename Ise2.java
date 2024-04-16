
public class Ise2 extends Ise3
{
    void display()
    {
        System.out.println(this);
    }
    public String toString()
    {
        return getClass().getSimpleName()+"@"+Integer.toHexString(hashCode());
    }
    public static void main(String[] args) {
        Ise2 i1 = new Ise2();
        i1.display();
    }
}