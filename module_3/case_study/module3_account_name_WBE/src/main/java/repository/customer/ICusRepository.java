package repository.customer;

import model.Customer;

import java.util.List;

public interface ICusRepository {
    List<Customer> getCusList();
    void insertCus(Customer customer);
    boolean updateCus(Customer customer);
    boolean deleteCus(Customer customer);
    Customer selectCusById(int id);
}
