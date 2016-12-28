package MainPackage.chapterthree;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSort
{

    public static void main(String[] args) {
        
        ArrayList<String> list = new ArrayList<String>();
        
        list.add("Ant");
        list.add("Cat");
        list.add("Bear");
        
        for(String s : list) 
            System.out.println(s);
            
        Collections.sort(list);
        
        for(String s : list) 
            System.out.println(s);
                
        
    }

}
