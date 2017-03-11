package MainPackage.chaptertwo;

public class Increment {

    // Declare variables
    static int i = 0;
    static int j;
    
    // Main method
    public static void main(String... args){
        System.out.println(i);
        System.out.println(i++);
        System.out.println(++i);
        i = 0; 
        
        j = i++;
        j = i++;
        j = i++;
        
        
        System.out.println(j);
        
        i = 0;
        j = i++ + i++ + i++; 
        
        System.out.println(j);
        
    }
}
