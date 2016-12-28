package MainPackage;

public class Bear extends Animal {
    
    public void doMove() {
        
        System.out.println("Bear walk");
        
    }
    
    public static void doStatic(){
        
        System.out.println("Do static bear thing");
        
    }
    
    public static void main(String[] args) {
        
        // Heading
        System.out.println("NEW STARTS HERE");
        
        // Bear section
        Bear bear = new Bear();
        bear.doMove();      // Bear walk
        bear.doStatic();    // Do static bear thing

        // Animal section
        Animal animal = new Bear();
        animal.doMove();    // Bear walk
        animal.doStatic();  // Do static animal thing
        
        
        
    }
}