import java.util.ArrayList;
import java.util.List;

public class RealEstateAgency {
    private List<IEstate> estateList;

    public RealEstateAgency() {
        estateList = new ArrayList<>();
        estateList.add(new House("House-1", 500, 50, 1, 0));
        estateList.add(new House("House-2", 750, 80, 2, 1));
        estateList.add(new House("House-3", 1000, 120, 3, 1));
        estateList.add(new Villa("Villa-1", 4000, 180, 3, 1));
        estateList.add(new Villa("Villa-2", 6500, 250, 6, 2));
        estateList.add(new Villa("Villa-3", 5250, 220, 4, 2));
        estateList.add(new SummerHouse("SummerHouse-1", 1000, 75, 2, 1));
        estateList.add(new SummerHouse("SummerHouse-2", 1200, 100, 4, 2));
        estateList.add(new SummerHouse("SummerHouse-3", 700, 55, 1, 0));
    }

    public void addEstate(IEstate newEstate) {
        estateList.add(newEstate);
    }

    public List<IEstate> getHouseList() {
        List<IEstate> houseList = new ArrayList<>();
        for(IEstate estate : estateList) {
            if(estate.getEstateType().equals("House"))
                houseList.add(estate);
        }

        return houseList;
    }

    public List<IEstate> getVillaList() {
        List<IEstate> villaList = new ArrayList<>();
        for(IEstate estate : estateList) {
            if(estate.getEstateType().equals("Villa"))
                villaList.add(estate);
        }

        return villaList;
    }

    public List<IEstate> getSummerHouseList() {
        List<IEstate> summerHouseList = new ArrayList<>();
        for(IEstate estate : estateList) {
            if(estate.getEstateType().equals("SummerHouse"))
                summerHouseList.add(estate);
        }

        return summerHouseList;
    }
}
