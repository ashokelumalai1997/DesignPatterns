public class ShapeFactoryTest {
    public static void main(String[] args) {

        ShapeFactory factory = new ShapeFactory();
        Shape roundFood = factory.getFood("Round");
        Shape cylinderFood = factory.getFood("Cylinder");

    }
}