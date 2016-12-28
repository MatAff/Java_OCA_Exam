package MainPackage.interfacepackage;

interface SimpleInterface {
    
    void walk();
    
    default void talk() {
        System.out.println("Bla bla bla");
    }
    
}