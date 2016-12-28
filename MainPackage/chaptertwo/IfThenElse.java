package MainPackage.chaptertwo;

class IfThenElse{
    
    static int x; 
    static boolean b;
    
    static public void main(String[] args) {
        
        
        // Heading
        System.out.println("START NEW CALL");
        
        
        // If
        x=2;
        if (x==1) 
            System.out.println("X is zero");
        else 
            System.out.println("Else");

        System.out.println(b);
            
        if (b=true) {
            System.out.println("If b");
        } else {
            System.out.println("Else b");
        }
         
        System.out.println(b);
        
        int x = b ? 15 : 30;
        System.out.println(x);
        
    }
}