package FURAMA_RESORT_PROJECT.services;

import FURAMA_RESORT_PROJECT.models.House;
import FURAMA_RESORT_PROJECT.models.Room;
import FURAMA_RESORT_PROJECT.models.Villa;

import java.util.LinkedHashMap;
import java.util.Set;

public class FacilityServiceImpl implements FacilityService {
    LinkedHashMap<Villa, Integer> villaService = new LinkedHashMap<>(5, 0.75f, true);
    LinkedHashMap<House, Integer> houseService = new LinkedHashMap<>(5, 0.75f, true);
    LinkedHashMap<Room, Integer> roomService = new LinkedHashMap<>(16, 0.75f, true);
    public static Integer villaTimes = 0;
    public static Integer houseTimes = 0;
    public static Integer roomTimes = 0;

    public void addVilla(Villa villa) {
        villaService.put(villa, villaTimes);
        villaTimes++;
    }

    public void addHouse(House house) {
        houseService.put(house, houseTimes);
        houseTimes++;
    }

    public void addRoom(Room room) {
        roomService.put(room, roomTimes);
        houseTimes++;
    }

    @Override
    public void displayList() {
        System.out.println("Villa List: ");
        Set<Villa> emptyVilla = villaService.keySet();
        for (Villa villa : emptyVilla) {
            System.out.println("Villa: " + villa.getServiceName() +",  Value: " + villaService.get(villa));
        }
        System.out.println("House List: ");
        Set<House> emptyHouse = houseService.keySet();
        for (House house : emptyHouse) {
            System.out.println("House: " + house.getServiceName()+",  Value: " + villaService.get(house));
        }
        System.out.println("Room List: ");
        Set<Room> emptyRoom = roomService.keySet();
        for (Room room : emptyRoom) {
            System.out.println("Room: " + room.getServiceName() + ",  Value: " +roomService.get(room));
        }
    }

    public void mainternanceList() {
        System.out.println("Danh sách bảo trì: ");
        Set<Villa> emptyVilla = villaService.keySet();
        for (Villa villa : emptyVilla) {
            if (villaService.get(villa) == 5) {
                System.out.println("Villa: " + villa.getServiceName() + villaService.get(villa));
            }
        }
        Set<House> emptyHouse = houseService.keySet();
        for (House house : emptyHouse) {
            if (houseService.get(house) == 5) {
                System.out.println("House: " + house.getServiceName() + houseService.get(house));
            }
        }
    }


//


}
