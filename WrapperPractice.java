public class WrapperPractice
{

    public static void main(String... args) {
        
        Boolean myBoolean = new Boolean(true);
        Byte myByte = new Byte((byte) 8);
        Short myShor = new Short((short) 16);
        Integer myInteger = new Integer(15);
        Long myLong = new Long(164);
        Float myFloat = new Float(1.0);
        Double myDouble = new Double(1.0);
        Character myCharacter = new Character('c');
        
        // parse and value of
        int primitive = Integer.parseInt("123");
        System.out.println(primitive);
        Integer wrapper = Integer.valueOf("123");
        System.out.println(wrapper);
      
        // Default values
        Integer mySecond;
        mySecond = null;
        System.out.println(mySecond);
        // int myInt = mySecond; // nullPointerException

    }

      
    
}
