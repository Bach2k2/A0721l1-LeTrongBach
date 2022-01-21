package service;

import model.Customer;
import repository.CusRepository;

import java.util.List;

public class CustomerManageImpl implements ICustomerManagement {
    CusRepository cusRepository = new CusRepository();
    @Override
    public List<Customer> getCusList() {
        List<Customer> customerList = cusRepository.getCusList();
        return customerList;
    }

    @Override
    public boolean createCus(Customer newCus) {
        boolean check=false;
        List<Customer> customerList = cusRepository.getCusList();
        // Check if the customer'id has already existed!
        for (Customer customer : customerList) {
            if(customer.getId()==newCus.getId()) check=false;
            break;
        }
        return check;
    }

    @Override
    public boolean updateCus(Customer customer) {
        if (cusRepository.updateCus(customer)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteCus(Customer customer) {
        if (customer != null) {
            return true;
        }
        return false;
    }

    @Override
    public Customer searchCus(Customer customer) {
        if (customer != null) {
            return customer;
        }
        return null;
    }

    @Override
    public int getAmount() {
        return CusRepository.customerAmount;
    }

    @Override
    public Customer getCusById(int id) {
        Customer customer=cusRepository.selectCusById(id);
        return customer;
    }
}
