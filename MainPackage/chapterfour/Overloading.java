package MainPackage.chapterfour;

public class Overloading
{
    void action(int i) {
        System.out.println("int");
    }
    
    void action(long i) {
        System.out.println("long");
    }
    
    void action(Integer i) {
        System.out.println("Integer");
    }
    
    void action(Object i) {
        System.out.println("Object");
    }
        
    public static void main(String[] args) {
    
        Overloading o = new Overloading();
        o.action(5f);
        
    }


}
