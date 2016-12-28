package mainpackage;


public class StringPractice
{

    public static void main(String[] args){
        
        // Declare variables
        String myString;
        String otherString;
        String two;
        String three;
        
        // Try to reassign
        myString = "Hello";
        myString = "world";
        System.out.println(myString);
        
         // Concat
        myString = myString.concat("!");
        System.out.println(myString);
        
        // Failed concat (not assigned to anything)
        myString.concat("!!");
        System.out.println(myString);
        
        // Length
        System.out.println(myString.length());
        
        // Char at
        System.out.println(myString.charAt(0));
        
        // Index of
        myString = myString.concat("w");
        System.out.println(myString.indexOf("w"));
        System.out.println(myString.indexOf("w",0));
        System.out.println(myString.indexOf("w",5));
        System.out.println(myString.indexOf("XX")); // Returns -1
        
        // Substring
        System.out.println("Substring section");
        otherString = myString.substring(2,3);
        System.out.println(otherString);
        //otherString = myString.substring(2,999); // StringIndexOutOfBoundsException
        //System.out.println(otherString);
        otherString = myString.substring(2,myString.length()); // Should run and print till end? > Correct
        System.out.println(myString);
        System.out.println(otherString);
        System.out.println(myString.substring(2,2));
        // System.out.println(myString.substring(99,99)); //StringIndexOutOfBoundsException
        
        // Cases
        System.out.println(myString.toUpperCase());
        
        // Comparison
        myString = "Dog";
        otherString = "Dog";
        System.out.println(myString.equals(otherString)); // true
        System.out.println(myString==otherString); // false - Points to different object // true probably cause of String pool?
        otherString = myString;
        System.out.println(myString==otherString); // true - Now points to the same object
        otherString = "dOG";
        System.out.println(myString.equalsIgnoreCase(otherString)); // true - ignoring case
        
        System.out.println("Section using explicitly created String objects");
        myString = new String("Cat"); // Can't create new for existing String??? >> Actually problem was lack of constructor call
        otherString = new String("Cat"); // Explicit object creation
        System.out.println(myString==otherString);
        System.out.println(myString.equals(otherString));
       
        // Starts/ends/contains
        System.out.println("Section on starts/ends/contains");
        myString = "Hello world";
        System.out.println(myString.startsWith("He"));
        System.out.println("Also works".startsWith("A"));
        System.out.println(myString.contains("ello"));
        
        // Replace
        System.out.println("Section on replace");
        System.out.println(myString.replace("ello","allo"));
        
        // Trim
        System.out.println("Section on trim");
        System.out.println(" bla ".trim());
        System.out.println(" bla ".trim().length());
        
        // Method chaining
        System.out.println("Section on method chaining");
        System.out.println(myString.concat(myString.concat("HI")).concat("bla ").trim()); // Complicated
        
    }

}
