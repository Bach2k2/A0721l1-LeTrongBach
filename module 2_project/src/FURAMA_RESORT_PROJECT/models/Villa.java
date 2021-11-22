package FURAMA_RESORT_PROJECT.models;

public class Villa extends Facilities{
    private String roomStandard;
    private int poolArea;
    private int floor;

    public Villa()
    {}
    public Villa(String serviceName, int area, double price, int maxAmount) {
        super(serviceName, area, price, maxAmount);
    }

    public Villa(String serviceName, int area, double price, int maxAmount, String roomStandard, int poolArea, int floor) {
        super(serviceName, area, price, maxAmount);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.floor = floor;
    }
}
