package MainPackage.chaptertwo;
public class ForEachStatement {

    public static void main(String[] args) {
        
        ForEachStatement FES = new ForEachStatement();
        
        FES.forEachLoop();
        
    }
    
    void forEachLoop() {
        
        String[] A = new String[3];
        A[0] = "A";
        A[1] = "B";
        A[2] = "C";
        
        for (String s : A)
            System.out.println(s);
        
    }

}
