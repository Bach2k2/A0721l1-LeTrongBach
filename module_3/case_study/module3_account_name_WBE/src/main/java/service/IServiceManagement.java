package service;

import model.Service;

import java.util.List;

public interface IServiceManagement {
    List<Service> getServiceList();
    Service getServiceById(int id);
    boolean createService(Service service);
    boolean updateService(Service service);
    boolean deleteService(Service service);
    //Search by name
    List<Service> searchService(String name);

}
