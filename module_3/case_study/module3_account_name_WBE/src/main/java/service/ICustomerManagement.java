package service;

import model.Customer;

import java.util.List;

public interface ICustomerManagement {
    List<Customer> getCusList();

    Customer getCusById(int id);

    boolean createCus(Customer customer);

    boolean updateCus(Customer customer);

    boolean deleteCus(Customer customer);

    Customer searchCus(Customer customer);

    int getAmount();

}
