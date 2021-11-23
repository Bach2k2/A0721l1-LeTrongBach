package FURAMA_RESORT_PROJECT.models;

public class Room extends Facilities{
   String freeService;

   public Room(){
   }
   public Room(String serviceName, int area, double price, int maxAmount,String rentType) {
      super(serviceName, area, price, maxAmount,rentType);
   }

   public Room(String serviceName, int area, double price, int maxAmount,String rentType,String freeService) {
      super(serviceName, area, price, maxAmount,rentType);
      this.freeService = freeService;
   }

}
