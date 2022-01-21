package service;

import model.Service;
import repository.service.SerRepository;

import java.util.List;

public class ServiceManageImpl implements IServiceManagement {
    private SerRepository serRepository=new SerRepository();
    @Override
    public List<Service> getServiceList() {
        List<Service> serviceList=serRepository.getServiceList();
        return serviceList;
    }

    @Override
    public Service getServiceById(int id) {
        Service service=serRepository.getServiceById(id);
        return service;
    }

    @Override
    public boolean createService(Service service) {
        if(service!=null)
        {
            serRepository.insertService(service);
            return true;
        }
        return false;
    }

    @Override
    public boolean updateService(Service service) {
        if(service !=null)
        {
            return serRepository.updateService(service);
        }
        return false;
    }

    @Override
    public boolean deleteService(Service service) {
       if(service !=null)
       {
           return serRepository.deleteService(service);
       }
       return false;
    }

    @Override
    public List<Service> searchService(String name) {
        return null;
    }
}
