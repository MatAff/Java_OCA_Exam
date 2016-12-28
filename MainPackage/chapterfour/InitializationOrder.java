package MainPackage.chapterfour;

public class InitializationOrder extends SuperInitializationOrder {
    InitializationOrder() {
        super(5);
        System.out.println("No argument constructor");
    }
    
    static { 
        System.out.println("Static initializer 1");
    }
    
    InitializationOrder(int i) {
        this();
        System.out.println("Argument constructor");
    }
    
    public static void main(String[] args) {
        
        InitializationOrder IO = new InitializationOrder(5);
        
    }
    
    {
        System.out.println("Non static initializer");
    }
    
    static {
        System.out.println("Static initializer 2");
    }
        
}
