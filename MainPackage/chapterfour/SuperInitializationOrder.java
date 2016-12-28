package MainPackage.chapterfour;

public class SuperInitializationOrder
{

    SuperInitializationOrder() {
        System.out.println("Super - No argument constructor");
    }
    
    static { 
        System.out.println("Super - Static initializer 1");
    }
    
    SuperInitializationOrder(int i) {
        //this();
        System.out.println("Super - Argument constructor");
    }
    
    public static void main(String[] args) {
        
        InitializationOrder IO = new InitializationOrder(5);
        
    }
    
    {
        System.out.println("Super - Non static initializer");
    }
    
    static {
        System.out.println("Super - Static initializer 2");
    }
        


}
