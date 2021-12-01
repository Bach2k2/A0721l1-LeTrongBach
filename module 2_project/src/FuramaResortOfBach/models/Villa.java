package FuramaResortOfBach.models;

import FURAMA_RESORT_PROJECT.models.Facilities;

public class Villa extends Facilities {
    private String roomStandard;
    private int poolArea;
    private int floor;

    public Villa()
    {}
    public Villa(String serviceName, int area, double price, int maxAmount,String rentType) {
        super(serviceName, area, price, maxAmount, rentType);
    }

    public Villa(String serviceName, int area, double price, int maxAmount,String rentType, String roomStandard, int poolArea, int floor) {
        super(serviceName, area, price, maxAmount,rentType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.floor = floor;
    }
}
