package MainPackage.chapterfour.Lambda;

public class Animal {
    private String name;
    private boolean hasFourLegs;
    private boolean makesNoice;
    private boolean canDance;
    
    // Constructor
    public Animal(String name, boolean legs, boolean noice, boolean dance) {
        this.name = name;
        hasFourLegs = legs;
        makesNoice = noice;
        canDance = dance;
    }
    
    // Getters
    public String getName() { return name; }
    public boolean hasFourLegs() { return hasFourLegs; }
    public boolean makesNoice() { return makesNoice; }
    public boolean canDance() { return canDance; }      
    public String toString() { return name; }

}
