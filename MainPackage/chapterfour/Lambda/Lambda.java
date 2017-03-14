package MainPackage.chapterfour.Lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda
{
    
    public static void main(String[] args) {
        
        List<Animal> animals = new ArrayList<Animal>();
        
        animals.add(new Animal("fish", false, false, false));
        animals.add(new Animal("dog", true, true, false));
        animals.add(new Animal("ant", false, false, true));
        animals.add(new Animal("human", false, true, true));
        
        // Traditional
        System.out.println("Traditional");
        print(animals, new CheckIfFourLegs());  
        
        // Lambda
        System.out.println("Lambda - has four legs");
        print(animals, a -> a.hasFourLegs());
        
        System.out.println("Lambda - makes noice");
        print(animals, a -> a.makesNoice());
        
        System.out.println("Simple return");
        print(animals, a -> {return true;});
        
    }
    
    private static void print(List<Animal> animals, CheckTrait checker) {
        
        for (Animal animal : animals) {
            
            if(checker.test(animal))
                System.out.println(animal);
            
        }
        
    }
    
}
