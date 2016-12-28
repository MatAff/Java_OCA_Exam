package MainPackage.chaptertwo;

public class ForStatement {

    public static void main(String[] args) {
        
        ForStatement FS = new ForStatement();
        FS.loop();
       
    }

    void loop() { 
        
        for(int i = 0; ; ) {
            i++;
            System.out.println(i);
            if (i==10) break;
        }
    }
    
}
