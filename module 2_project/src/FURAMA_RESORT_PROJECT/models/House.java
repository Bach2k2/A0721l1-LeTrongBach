package FURAMA_RESORT_PROJECT.models;

public class House extends Facilities {
    String roomStandard;

    public House(String serviceName, int area, double price, int maxAmount, String roomStandard) {
        super(serviceName, area, price, maxAmount);
        this.roomStandard = roomStandard;
    }
}
