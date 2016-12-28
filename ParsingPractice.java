public class ParsingPractice
{
    public static void main(String[] args) {
       // System.out.println("Hello world!");
       
       // Declare variables
       byte myByte;
       short myShort;
       int myInt;
       long myLong;
       float myFloat;
       double myDouble;
       char myChar;
       boolean myBoolean;
     
       myByte = 127;
       myByte++;
       System.out.println("myByte = " + myByte); // This wraps round, kinda cool
       
       myInt = myByte; 
       System.out.println("myInt = " + myInt);
       
       myLong = myInt;
       System.out.println("myLong = " + myLong);
       
       // myShort = myLong; // Does not compile
       // System.out.println("myShort = " + myShort);
       
       myInt = (int) myLong;
       System.out.println("myInt = " + myInt);
       
       myInt = Integer.MAX_VALUE;
       System.out.println("Integer max value = " + myInt);
       
       myInt++;
       System.out.println("Integer wrap around = " + myInt);
       
       myLong = Integer.MAX_VALUE;
       myLong++;
       myInt = (int) myLong;
       System.out.println("Parsing to big int = " + myInt);
       
       myFloat = Integer.MAX_VALUE;
       System.out.println("myFloat = " + myFloat);
       
       myFloat =  (float) 2.0;
       System.out.println("myFloat = " + myFloat);
   
       myLong = 123;
       System.out.println("myLong = " + myLong);
       
       
    }
    
}
