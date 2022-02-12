public class House extends Estate implements IEstate {
    public House(String name, int cost, int squareMeters, int roomCount, int livingRoomCount) {
        super(name, cost, squareMeters, roomCount, livingRoomCount, "House");
    }
}
