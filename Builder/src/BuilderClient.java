public class BuilderClient {
    public static void main(String[] args) {
        ApartmentBuilder apartmentBuilder = new ApartmentBuilder();
        Apartment apartment1 = apartmentBuilder
                .setSqm(25)
                .setRooms(2)
                .setCity("London")
                .setArea("Kensington")
                .setKitchen(true)
                .build();
        apartment1.display();

        Apartment apartment2 = apartmentBuilder
                .setSqm(23).setCity("NewYork").build();

        apartment2.display();

    }
}