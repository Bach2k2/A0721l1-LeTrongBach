package FuramaResortOfBach.models;

import FURAMA_RESORT_PROJECT.models.Facilities;

public class House extends Facilities {
    String roomStandard;

    public House(String serviceName, int area, double price, int maxAmount, String roomStandard,String rentType) {
        super(serviceName, area, price, maxAmount,rentType);
        this.roomStandard = roomStandard;
    }
}
