package ExProject.Services;

import ExProject.models.Truck;

import java.io.*;
import java.util.LinkedList;

public class TruckManage implements TransService<Truck> {
    public static LinkedList<Truck> truckList = new LinkedList();
    public static int amount = 0;

    @Override
    public void add(Truck truck) {
        truckList.add(truck);
        amount++;
        try
        {

            String data=truck.toString();
            File file=new File("src/ExProject/files/xeTai.csv");
            FileWriter fileWriter=new FileWriter(file,true);
            BufferedWriter writer=new BufferedWriter(fileWriter);
            writer.write(data);
            writer.write("\n ");
            writer.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void edit(String signal, Truck newTruck) {
        if (truckList.isEmpty()) {
            System.out.println("List is empty");
        } else {
            for (Truck truck : truckList) {
                if (truck.getCtrlSignal().equals(signal)) truck = newTruck;
            }
        }
    }

    @Override
    public void delete(String signal) {
        if (truckList.isEmpty()) {
            System.out.println("List is empty");
        } else {
            for (Truck truck : truckList) {
                if (truck.getCtrlSignal().equals(signal)) truckList.remove(truck);
            }
        }
    }

    @Override
    public boolean search(String signal) {
        if (truckList.isEmpty())
        {
            System.out.println("List is empty");
            return false;
        }
        else
        {
            for(Truck truck:truckList)
            {
                if(truck.getCtrlSignal().equals(signal)) return true;
            }
            return false;
        }
    }

    @Override
    public void display() {
        if (truckList.isEmpty()) {
            System.out.println("List is empty");
        } else {
            for (Truck truck : truckList) {
                System.out.println(truck.toString());
            }
        }

    }
}
