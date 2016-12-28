package MainPackage.abstractpackage;

public class MyConcreteClass extends MyAbstractClass {
    
    public void firstAbstract() {
        System.out.println("First abstract");
    }
    
    public static void main(String[] args) {
        
        MyConcreteClass myClass = new MyConcreteClass();
        
        myClass.firstAbstract();
    }
    
}