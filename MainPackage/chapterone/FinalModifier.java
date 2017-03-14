package MainPackage.chapterone;
public class FinalModifier
{

    final int i;
        
    {
        i = 10;
    }
    public static void main(String[] args) {
    
        FinalModifier fm = new FinalModifier();
        
        //fm.i++;
        
        System.out.println(fm.i);
    
    }
}
