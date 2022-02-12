import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        RealEstateAgency agency = new RealEstateAgency();

        System.out.println("Total cost of all houses: " + houseCost(agency));
        System.out.println("Total cost of all villas: " + villaCost(agency));
        System.out.println("Total cost of all summer houses: " + summerHouseCost(agency));
        System.out.println("Total cost of all estates: " + allCost(agency));

        System.out.println("Average area of all houses: " + houseAvgArea(agency));
        System.out.println("Average area of all houses: " + villaAvgArea(agency));
        System.out.println("Average area of all houses: " + summerHouseAvgArea(agency));
        System.out.println("Average area of all estates: " + allAvgArea(agency));

        System.out.println("List of estates that has 2 rooms and 1 living room: ");
        List<IEstate> filterList = roomFilter(agency, 2, 1);
        for(IEstate estate : filterList)
            System.out.println("\t" + estate.getName());

        System.out.println("List of estates that has 4 rooms and 2 living rooms: ");
        filterList = roomFilter(agency, 4, 2);
        for(IEstate estate : filterList)
            System.out.println("\t" + estate.getName());

        System.out.println("List of estates that has 3 rooms and 1 living room: ");
        filterList = roomFilter(agency, 3, 1);
        for(IEstate estate : filterList)
            System.out.println("\t" + estate.getName());
    }

    public static List<IEstate> roomFilter(RealEstateAgency agency, int roomCount, int livingRoomCount) {
        List<IEstate> filterList = new ArrayList<>();
        List<IEstate> houseList = agency.getHouseList();
        List<IEstate> villaList = agency.getVillaList();
        List<IEstate> summerHouseList = agency.getSummerHouseList();

        for(IEstate house : houseList) {
            if(house.getRoomCount() == roomCount && house.getLivingRoomCount() == livingRoomCount)
                filterList.add(house);
        }

        for(IEstate villa : villaList) {
            if(villa.getRoomCount() == roomCount && villa.getLivingRoomCount() == livingRoomCount)
                filterList.add(villa);
        }

        for(IEstate summerHouse : summerHouseList) {
            if(summerHouse.getRoomCount() == roomCount && summerHouse.getLivingRoomCount() == livingRoomCount)
                filterList.add(summerHouse);
        }

        return filterList;
    }

    public static int allCost(RealEstateAgency agency) {
        return houseCost(agency) + villaCost(agency) + summerHouseCost(agency);
    }

    public static double allAvgArea(RealEstateAgency agency) {
        return houseAvgArea(agency) + villaAvgArea(agency) + summerHouseAvgArea(agency);
    }

    public static int houseCost(RealEstateAgency agency) {
        List<IEstate> houseList = agency.getHouseList();
        int totalCost = 0;
        for(IEstate house : houseList) {
            totalCost += house.getCost();
        }

        return totalCost;
    }

    public static double houseAvgArea(RealEstateAgency agency) {
        List<IEstate> houseList = agency.getHouseList();
        double totalArea = 0;
        for(IEstate house : houseList) {
            totalArea += house.getSquareMeters();
        }

        return totalArea / houseList.size();
    }

    public static int villaCost(RealEstateAgency agency) {
        List<IEstate> villaList = agency.getVillaList();
        int totalCost = 0;
        for(IEstate villa : villaList) {
            totalCost += villa.getCost();
        }

        return totalCost;
    }

    public static double villaAvgArea(RealEstateAgency agency) {
        List<IEstate> villaList = agency.getVillaList();
        double totalArea = 0;
        for(IEstate villa : villaList) {
            totalArea += villa.getSquareMeters();
        }

        return totalArea / villaList.size();
    }

    public static int summerHouseCost(RealEstateAgency agency) {
        List<IEstate> summerHouseList = agency.getSummerHouseList();
        int totalCost = 0;
        for(IEstate summerHouse : summerHouseList) {
            totalCost += summerHouse.getCost();
        }

        return totalCost;
    }

    public static double summerHouseAvgArea(RealEstateAgency agency) {
        List<IEstate> summerHouseList = agency.getSummerHouseList();
        double totalArea = 0;
        for(IEstate summerHouse : summerHouseList) {
            totalArea += summerHouse.getSquareMeters();
        }

        return totalArea / summerHouseList.size();
    }
}
