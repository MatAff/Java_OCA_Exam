
// Need import statement!!!
import java.util.List;
import java.util.ArrayList;

public class ArrayListPractice
{
  
    public static void main(String... args) {
        
        ArrayList one;
        ArrayList two = new ArrayList();
        ArrayList three = new ArrayList(10);
        ArrayList four = new ArrayList(three);
        
        one = new ArrayList();
        
        // Generics (specify type of class)
        ArrayList<String> five = new ArrayList<String>(10);
        ArrayList<String> six = new ArrayList<>(10);
        
        // Sub class of list
        List<String> seven = new ArrayList<>(); // Fine
        // ArrayList<String> eight = new List<>(); // Does not compile // List is an interface and can not be instantiated

        // Add
        one.add("Boo"); 
        one.add(Boolean.TRUE);
        System.out.println(one);
        
        // five.add(Boolean.TRUE);
        five.add("Hello");
        System.out.println(five);
        five.add(0,"Do say");
        System.out.println(five);
        System.out.println(five.toString().replace(",",""));
        
        // Remove
        five.remove("Do say");
        System.out.println(five);
        Object E = five.remove(0);
        System.out.println(E);
        five.add("tada");
        System.out.println(five.remove(0));
        System.out.println(five);
        
        // Set
        one = new ArrayList(10);
        one.add("First");
        // one.set(2,"Third"); // Does not compile
        // one.set(1,"Second"); // Also does not compile

        // isEmpty/size
        System.out.println(one.isEmpty()); // false
        System.out.println(one.size()); // Result: 1
        
        // Clear
        one.clear();
        System.out.println(one.isEmpty()); // true
        
        // contains
        one.add("Bear");
        System.out.println(one.contains("Bear")); // true
        
        // Equality
        ArrayList<String> a = new ArrayList<>();
        a.add("HI");
        ArrayList<String> b = new ArrayList<>();
        b.add("HI");
        ArrayList c = new ArrayList();
        c.add("HI");
        ArrayList d;
        d = a;
        System.out.println(a.equals(b)); // true
        System.out.println(a.equals(c)); // ? >> true! Even though not declared with generic
        System.out.println(a==b); // false
        System.out.println(a==d); // true; Points to same object
        
    }
    
    
}
