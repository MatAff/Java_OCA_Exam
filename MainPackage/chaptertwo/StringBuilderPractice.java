package mainpackage;


public class StringBuilderPractice
{
   
   public static void main(String[] args) { 
    
    StringBuilder alpha = new StringBuilder();
    StringBuilder gamma;

    // Instantiated on different line
    gamma = new StringBuilder();
        
    StringBuilder beta = new StringBuilder("Cat");
    System.out.println(beta);
     
    // Append
    beta.append(" dog");   
    System.out.println(beta);
    
    // Loop play
    for(char myChar = 'a'; myChar <= 'z'; myChar++) {
        alpha.append(myChar);
        System.out.println(alpha);
    }

    // Instantiation
    StringBuilder delta = new StringBuilder(10); // Creates new StringBuilder with 10 spaces
    delta.append("Pony");
    System.out.println(delta);
    System.out.println(delta.length());
    delta.append("somereallylongword");
    System.out.println(delta);
    System.out.println(delta.length());
    
    // Insert
    StringBuilder eta;
    eta = new StringBuilder(10);
    eta.insert(0,"bla");
    System.out.println(eta);
    //eta.insert(5,"bla"); // StringIndexOutOfBoundsException
    //System.out.println(eta);
    eta.insert(1,"hi");
    System.out.println(eta);
    
    // Delete 
    eta.deleteCharAt(1);
    System.out.println(eta);
    // eta.delete('b'); // Nope no bueno
    // System.out.println(eta);
    // eta.replace("b",""); // Doesn't work either
    // System.out.println(eta);
    eta = new StringBuilder("Fresh");
    System.out.println(eta);
    System.out.println(eta.delete(1,2)); // Fesh? > Correct
    
    // Reverse
    System.out.println(eta.reverse());
    
    String myString = eta.toString();
    System.out.println(myString);
  }
    
}
