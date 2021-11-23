package ExProject.Services;

import ExProject.models.Motor;
import ExProject.VehicleException;

import java.util.LinkedList;
import java.util.List;

public class MotorManage implements TransService<Motor> {
    public static List<Motor> motorList=new LinkedList<>();
    public static int amount = 0;
    @Override
    public void add(Motor motor) {
        motorList.add(motor);
    }

    @Override
        public void edit(String signal, Motor newMotor){
            if(motorList.isEmpty())
            {
                System.out.println("List is empty");
            }
            else {
                try
                {
                    if(search(signal))
                    {
                        for(Motor motor:motorList)
                        {
                            if(motor.getCtrlSignal().equals(signal)) motor=newMotor;
                        }
                    }
                    else
                    {
                        throw new VehicleException("Không tìm thấy biển số");
                    }
                }catch (VehicleException e)
                {
                    e.printStackTrace();
                }
            }

        }

    @Override
    public void delete(String signal) {
        if(motorList.isEmpty())
        {
            System.out.println("List is empty");
            return;
        }
        else
        {
            try
            {
                if (search(signal))
                {
                    for(Motor motor:motorList) {
                        motorList.remove(motor);
                    }
                    System.out.println("Đã xóa thành công");
                }
                else
                {
                    throw new VehicleException("Không tìm thấy biển số");
                }
            } catch (VehicleException e) {
                e.printStackTrace();
            }

        }
    }

    @Override
    public boolean search(String signal) throws VehicleException{
        if(motorList.isEmpty())
        {
            System.out.println("List is empty");
            return false;
        }
        else
        {
            for(Motor motor:motorList)
            {
                if(motor.getCtrlSignal().equals(signal)) return true;
            }
            return false;
        }
    }

    @Override
    public void display() {
        if(motorList.isEmpty())
        {
            System.out.println("List is empty");
            return;
        }
        else
        {
            for(Motor motor:motorList)
            {
                System.out.println(motor.toString());
            }
        }
    }
}
