package MainPackage.chapterthree;

import java.util.Arrays;

public class StringSort
{

    public static void main(String[] args) {
    
        StringSort ss = new StringSort();
        ss.sort();
        
    }
    
    void sort() {
        
        String[] myArray = {"A","a","Z","z","0","9","100"};
            
        Arrays.sort(myArray);
        
        for (String s : myArray)
            System.out.println(s);
        
    }
    
}
