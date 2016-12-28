package MainPackage.chapterfour;

public class Cat extends Animal{
    
    public Cat() {
        System.out.println("New cat is being created");
    }
    
    public static void main(String[] args) {
        System.out.println("");
        Cat cat = new Cat();
        
        cat.doMove();
        cat.printMyValue();
        cat.eat();
        cat.doStatic();
        
        Animal animal = new Cat();
        animal.doMove();
        animal.doStatic();
        // animal.eat(); // Does not compile, reference type does not have eat method
        
        Animal trueAnimal = new Animal();
        trueAnimal.doMove();
    }
    
    public static void doStatic() {
        System.out.println("Do static cat thing");
    }
    
    public void doMove() {
        System.out.println("Crawls");
    }
    
    public void eat() {
        System.out.println("Eating cat food");
    }
    
    void printMyValue() {
        System.out.println(super.myValue);
        System.out.println(this.myValue);
        System.out.println(myValue);
    }
}