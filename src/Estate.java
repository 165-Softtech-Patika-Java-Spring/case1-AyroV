public class Estate implements IEstate {
    private String name;
    private int cost;
    private int squareMeters;
    private int roomCount;
    private int livingRoomCount;
    private String estateType;

    public Estate(String name, int cost, int squareMeters, int roomCount, int livingRoomCount, String estateType) {
        this.name = name;
        this.cost = cost;
        this.squareMeters = squareMeters;
        this.roomCount = roomCount;
        this.livingRoomCount = livingRoomCount;
        this.estateType = estateType;
    }

    @Override
    public String getName() { return name; }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public int getSquareMeters() {
        return squareMeters;
    }

    @Override
    public int getRoomCount() {
        return roomCount;
    }

    @Override
    public int getLivingRoomCount() {
        return livingRoomCount;
    }

    @Override
    public String getEstateType() {
        return estateType;
    }
}
