package MainPackage.chapterfour.Lambda;

public class CheckIfFourLegs implements CheckTrait {

    public boolean test(Animal a) {
        return a.hasFourLegs();
    }
    
}
