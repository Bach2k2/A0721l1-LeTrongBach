package FURAMA_RESORT_PROJECT.models;

public class Room extends Facilities{
   String freeService;

   public Room(){
   }
   public Room(String serviceName, int area, double price, int maxAmount) {
      super(serviceName, area, price, maxAmount);
   }

   public Room(String serviceName, int area, double price, int maxAmount, String freeService) {
      super(serviceName, area, price, maxAmount);
      this.freeService = freeService;
   }

}
