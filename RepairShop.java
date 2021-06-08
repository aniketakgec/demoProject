// Example of abstraction

abstract class Phone{
    abstract void call();
    abstract void camera();
}

class Samsung extends Phone
{

    @Override
    void call() {
        System.out.println("Networks is 4g LTE");
        
    }

    @Override
    void camera() {
      System.out.println("Camera is 16MP");
        
    }
    
}

class IPhone extends Phone{

    @Override
    void call() {
        System.out.println("Networks is 4g VOLTE");
        
    }

    @Override
    void camera() {
       System.out.println("Camers is 48MP");
        
    }

}

public class RepairShop 
{
    public void repair(Phone p)
    {
        p.call();
        p.camera();
    }




    public static void main(String[] args) {
        RepairShop rp=new RepairShop();
        rp.repair(new Samsung());
        rp.repair(new IPhone());

    }
    
}
