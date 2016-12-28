
import java.util.Arrays;

public class ArrayPractice
{
   
    public static void main(String[] args) {
        
        int[] intArray = new int[3];
        System.out.println(intArray[2]); // Prints 0 as int is initiated to 0
        
        Integer[] integerArray = new Integer[3];
        System.out.println(integerArray[2]); // Prints null as wrapper class is instantiated to null
        
        // Valid declarations
        int[] one;
        int [] two;
        int three[];
        int four []; 
        
        // Multiple declarations
        int[] five, six;
        
        // Crazy declarations
        int seven[], eight;
        seven = new int[] { 1,2,3 };
        // eight = new int[] { 4,5,6 }; // Does not compile as eight is not an array
        int nine[] = new int[] {};  // Also allowed somehow
        System.out.println(nine.length); // Note length does not have ()!!!
        nine = new int[3];
        System.out.println(nine); // prints reference;
        System.out.println(nine.length);
        
        // Populate using loop
        int[] ten = new int[10];
        for(int i = 0; i < ten.length; i++) {
            ten[i] = i;
        }

        // Sort
        System.out.println("Section on sorting arrays");
        byte[] sortArray = new byte[] { 5,3,9 };
        Arrays.sort(sortArray); // Needs import!! 
        for(int i = 0; i < sortArray.length; i++) {
            System.out.println(sortArray[i]);
        }
        
        // Searching
        int[] searchArray = new int[] {8,2,6,4};
        System.out.println(Arrays.binarySearch(searchArray,4)); // Unsorted array = unexpected result
        Arrays.sort(searchArray);
        System.out.println(Arrays.binarySearch(searchArray,4)); // Result: 1
        System.out.println(Arrays.binarySearch(searchArray,3)); // Result: -2
        System.out.println(Arrays.binarySearch(searchArray,0)); // Result: -1
        
        // Varags
        String[] first;
        String second[];
        String []third;
//        String... fourth;
//        String fifth...;

        // Multidimentional array
        int[][] multi = new int[2][];
        
        
        
    }
    
    
}
