package FURAMA_RESORT_PROJECT.services;

import FURAMA_RESORT_PROJECT.models.Booking;
import FURAMA_RESORT_PROJECT.models.Contract;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.TreeSet;

public class BookingServiceImp implements BookingService,ContractService {
    public TreeSet<Booking> bookinglist= new TreeSet<>();
    public TreeSet<Contract> contractList= new TreeSet<>();
    public static Queue<Booking> bookings=new ArrayDeque<>();
    public static int amount=0;
    public void addBooking(Booking e)
    {
        bookinglist.add(e);
        amount++;
    }
    public void display()
    {
        for(Booking booking:bookinglist)
        {
            System.out.println(booking.toString());
        }
    }
    int getAmount()
    {
        return amount;
    }
    public void addContract(Contract c)
    {
       contractList.add(c);
    }
    public void edit(int MKH,int bookingCode, int contractNum, double moneyPay, double total)
    {
        for(Contract contract:contractList)
        {
            if(contract.getMKH()==MKH)
            {
                contract.setContractNum(contractNum);
                contract.setBookingCode(bookingCode);
                contract.setMoneyPay(moneyPay);
                contract.setTotal(total);
            }
        }
    }
    @Override
    public void displayList() {
        for(Contract contract:contractList)
        {
            System.out.println(contract.toString());
        }
    }

}
