public class Dog extends Animal {
    
    public void bark() {
        System.out.println("Woof!");
    }
    
    public static void main(String[] args) {
        
        Animal animal = new Dog();
        animal.makeSound();
        // animal.bark(); // Does not compile
        
        Dog dog = new Dog();
        dog.makeSound();
        dog.bark();
        
        
    }
    
}