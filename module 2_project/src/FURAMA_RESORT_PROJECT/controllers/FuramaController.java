package FURAMA_RESORT_PROJECT.controllers;

import FURAMA_RESORT_PROJECT.models.*;
import FURAMA_RESORT_PROJECT.services.BookingServiceImp;
import FURAMA_RESORT_PROJECT.services.FacilityServiceImpl;

import java.util.Scanner;

public class FuramaController {
    public static FacilityServiceImpl facilityService = new FacilityServiceImpl();
    public static BookingServiceImp bookingService = new BookingServiceImp();

    public void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        //System.out.println(flush());
        int click;
        do {
            System.out.print("""

                    \t\t|-----------------Menu-------------------|
                    \t\t|\t\t1.\tEmployee Management\t\t\t|
                    \t\t|\t\t2.\tCustomer Management\t\t\t|
                    \t\t|\t\t3.\tFacility Management\t\t\t|
                    \t\t|\t\t4.\t Booking Management\t\t\t|
                    \t\t|\t\t5.\tPromotion Management\t\t|""");
            System.out.println("\n\t\t|---------------------------------------|");


            System.out.println("Enter your choice: ");
            click = scanner.nextInt();
            switch (click) {
                case 1 -> {
                    System.out.println("Function: Employee Management");
                    String[] smallMenu1 = {"Display list employees", "Add new employee", "Edit employee", "Return main menu"};
                    Menu menu1 = new Menu(4, smallMenu1);
                    menu1.displayMenu();

                }
                case 2 -> {
                    String[] smallMenu2 = {"Display list customers", "Add new customers", "Edit customers", "Return main menu"};
                    Menu menu2 = new Menu(4, smallMenu2);
                    menu2.displayMenu();

                }
                case 3 -> {
                    int facChoice;
                    String[] smallMenu3 = {"Display list facilities", "Add new facilities", "display list facilities mainternance", "Return main menu"};
                    Menu menu3 = new Menu(4, smallMenu3);
                    //Lựa chọn với chức năng in và thêm Fac:
                    do {
                        menu3.displayMenu();
                        System.out.println("Nhập tùy chọn: ");
                        facChoice = scanner.nextInt();
                        switch (facChoice) {
                            case 1: {
                                facilityService.displayList();
                                break;
                            }
                            case 2: {
                                int addFacChoice;
                                do {
                                    String[] facMenu = {"1.\tAdd New Villa", "2.\tAdd New House", "3.\tAdd New Room", "4.Back to menu"};
                                    Menu menu3_1 = new Menu(4, facMenu);
                                    menu3_1.displayMenu();
                                    System.out.println("Nhập tùy chọn: ");
                                    addFacChoice = scanner.nextInt();
                                    switch (addFacChoice) {
                                        case 1: {
                                            Villa villa = new Villa("Villa", 200, 400, 5, "Very Good", 100, 3);
                                            facilityService.addVilla(villa);
                                            break;
                                        }
                                        case 2: {
                                            House house = new House("House", 100, 200, 5, "good");
                                            facilityService.addHouse(house);
                                            break;
                                        }
                                        case 3: {
                                            Room room = new Room("Room", 75, 150, 16, "Breakfast");
                                            facilityService.addRoom(room);
                                            break;
                                        }
                                        case 4: {
                                            break;
                                        }
                                        default: {
                                            System.out.println("Lựa chọn sai");
                                            break;
                                        }
                                    }
                                } while (addFacChoice != 4);
                            }
                            case 3: {
                                facilityService.mainternanceList();
                                break;
                            }
                            case 4:
                                break;
                            default: {
                                System.out.println("Inproper choice!");
                            }
                        }
                    } while (facChoice != 4);
                }
                case 4 -> {
                    String[] smallMenu4 = {"Add new booking", "Display list booking", "Create new contract", "Display list contract", "Edit contracts", "Return main menu"};
                    Menu menu4 = new Menu(6, smallMenu4);
                    int bookingChoice;
                    do {
                        menu4.displayMenu();
                        System.out.println("Enter the choice:");
                        bookingChoice = scanner.nextInt();
                        switch (bookingChoice) {
                            case 1: {
                                System.out.println("Enter the begin date: ");
                                scanner.nextLine();
                                String beginDate = scanner.nextLine();
                                System.out.println("Enter the end date: ");
                                String endDate = scanner.nextLine();
                                Booking booking = new Booking(beginDate, endDate, "villa", "Villa 1");
                                bookingService.addBooking(booking);
                                break;
                            }
                            case 2: {
                                bookingService.display();
                                break;
                            }
                            case 3: {
                                Contract contract = new Contract(1, 200, 250, 1);
                                bookingService.addContract(contract);
                                break;
                            }
                            case 4: {
                                bookingService.displayList();
                                break;
                            }
                            case 5: {
                                bookingService.edit(1, 2, 1, 220, 270);
                            }
                            case 6:
                                break;
                            default:
                                break;
                        }
                    } while (bookingChoice != 6);

                }
                case 5 -> {
                    String[] smallMenu5 = {"Display list customers use service", "Display list customers get voucher", "Return main menu"};
                    Menu menu5 = new Menu(3, smallMenu5);
                    menu5.displayMenu();

                }
                case 6 -> System.out.println("---------------SEE YOU AGAIN-----------------");
                default -> System.out.println("Nhap sai lua chon");
            }
        }
        while (click != 6);
    }
}

class Menu {

    public int optRange;
    public String[] OptionList;

    public Menu(int number, String[] options) {
        this.optRange = number;
        this.OptionList = options;
    }

    public void displayMenu() {
        for (int i = 0; i < optRange; i++) {
            System.out.println((i + 1) + ". \t" + OptionList[i]);
        }
    }
}

class Main {
    public static void main(String[] args) {
        FuramaController manager = new FuramaController();
        manager.displayMainMenu();

    }
}
