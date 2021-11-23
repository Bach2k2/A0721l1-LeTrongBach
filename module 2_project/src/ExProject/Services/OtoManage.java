package ExProject.Services;

import ExProject.models.Oto;

import java.util.ArrayList;
import java.util.List;

public class OtoManage implements TransService<Oto> {

    public static List<Oto> otoLists = new ArrayList<>();
    public static int amount = 0;

    @Override
    public void add(Oto o) {
        otoLists.add(o);
        amount++;
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


}
