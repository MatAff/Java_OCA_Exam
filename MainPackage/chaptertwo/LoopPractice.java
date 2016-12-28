package MainPackage.chaptertwo;

public class LoopPractice
{
    static long z;
    public static void main(String... args) {
        System.out.println("For loop");
        z = 10;
        for(int i = 0, y=5; i < 10 & z==10; i = i + y, z++) {
            y--;
            z--;
            System.out.println(y);
            System.out.println(i);
        }
    }
}
