public class PrototypeClient {
    public static void main(String[] args) {

        Vehicle c1 = new Car(4,30000,"Blue");
        Vehicle c3 = c1.clone();

        c3.isClone(c1);
        c1.isClone(c3);

        Vehicle b1 = new BiCycle(2, 1000, true);
        Vehicle b2 = b1.clone();

        b2.isClone(b1);
        b1.isClone(b2);

        b1.isClone(c1);
    }
}