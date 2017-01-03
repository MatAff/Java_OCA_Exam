package MainPackage.chapterfour.Lambda;

import java.util.ArrayList;
import java.util.List;

public class Traditional
{
    
    public static void main(String[] args) {
        
        List<Animal> animals = new ArrayList<Animal>();
        
        animals.add(new Animal("fish", false, false, false));
        animals.add(new Animal("dog", true, true, false));
        animals.add(new Animal("ant", false, false, true));
        animals.add(new Animal("human", false, true, true));
        
        print(animals, new CheckIfFourLegs());  
        
    }
    
    private static void print(List<Animal> animals, CheckTrait checker) {
        
        for (Animal animal : animals) {
            
            if(checker.test(animal))
                System.out.println(animal);
            
        }
        
    }
    
}
