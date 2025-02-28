public class Calculator {

    public boolean value(boolean A, boolean B) {
        if (A && B) {
            System.out.println("Both true");
            return true;
        } else if (!A && !B) {
            System.out.println("Both false");
            return false;
        }
        System.out.println("Values not equal");
        return false;
    }
}
