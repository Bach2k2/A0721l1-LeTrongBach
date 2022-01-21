package repository.service;

import model.Service;

import java.util.List;

public interface ISerRepository {
    List<Service> getServiceList();

    Service getServiceById(int id);

    void insertService(Service service);

    boolean updateService(Service service);

    boolean deleteService(Service service);

}
