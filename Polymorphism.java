class Bird
{

    public void fly(){
       System.out.println("I can fly");   
    }

    public void sound()
    {
        System.out.println("I make sound");
    }
 }
class Duck extends Bird{
    @Override
    public void sound() {
        System.out.println("I quak");
    }

    @Override
    public void fly() {
        System.out.println("I cannot fly too high!!");
    }
    
}

public class Polymorphism
 {
    
    public static void main(String[] args) {
        Bird b=new Duck();
        b.fly();
        b.sound();
    }
}
