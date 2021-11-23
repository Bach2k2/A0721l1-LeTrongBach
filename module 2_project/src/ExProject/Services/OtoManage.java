package ExProject.Services;

import ExProject.VehicleException;
import ExProject.models.Oto;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class OtoManage implements TransService<Oto> {

    public static List<Oto> otoLists = new ArrayList<>();
    public static int amount = 0;

    @Override
    public void add(Oto o) {
        otoLists.add(o);
        amount++;
        try
        {
            String path="src/ExProject/files/xeOto.csv";
            writeInFile(path);
        }catch (IOException e)
        {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public void edit(String signal, Oto newOto) {
            if(otoLists.isEmpty())
            {
                System.out.println("List is empty");
            }
            else {
                for(Oto oto:otoLists)
                {
                    if(oto.getCtrlSignal().equals(signal)) oto=newOto;
                }
            }
    }

    @Override
    public void delete(String signal) {
        if (otoLists.isEmpty()) {
            System.out.println("Danh sách trống ");
        } else {
            if(search(signal))
            {
                for (Oto o : otoLists) {
                    if (o.getCtrlSignal().equals(signal)) {
                        otoLists.remove(o);
                        break;
                    }
                }
            }
            else {
                try {
                    throw new VehicleException("Không có biển số phù hợp");
                } catch (VehicleException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public boolean search(String signal) {
        if(otoLists.isEmpty())
        {
            System.out.println("List is empty");
            return false;
        }
        else
        {
            for(Oto oto:otoLists)
            {
                if(oto.getCtrlSignal().equals(signal)) return true;
            }
            return false;
        }
    }


    @Override
    public void display() {
        for (Oto o : otoLists
        ) {
            System.out.println(o.toString());
        }
    }
    public void writeInFile(String path) throws IOException
    {
        FileWriter file=new FileWriter(path);
        BufferedWriter bfw=new BufferedWriter(file);
        for (Oto oto:otoLists)
        {
            String plate= oto.getCtrlSignal();
            String label=oto.getProductLabel();
            String year= Integer.toString(oto.getYearProduct());
            String owner= oto.getOwner();
            String seat =Integer.toString(oto.getSeat());
            String type= oto.getType();
            String []data={plate,label,year,owner,seat,type};
            for (int i = 0; i < data.length; i++) {
                bfw.write(data[i]+", ");
            }
            bfw.write("\n ");
        }

        bfw.close();
    }
    public int getSize()
    {
        return amount;
    }
    public Oto getVehicle(int index)
    {
        return otoLists.get(index);
    }

}
