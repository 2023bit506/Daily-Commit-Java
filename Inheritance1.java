class Vehicle
{
    void Identity()
    {
        System.out.println("I am Vehicle");
    }
}
class Car extends Vehicle
{
    void Name()
    {
        System.out.println("I am a Car");
    }
}

class Bolero extends Car
{
    void Price()
    {
        System.out.println("150000");
    }
}

public class Inheritance1 
{
    public static void main(String[] args) {
        Bolero b1 = new Bolero();
        b1.Identity();
        b1.Name();
        b1.Price();
    }    
}
