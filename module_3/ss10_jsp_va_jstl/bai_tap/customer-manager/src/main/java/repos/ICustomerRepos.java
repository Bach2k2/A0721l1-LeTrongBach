package repos;

import model.Customer;

import java.util.List;

public interface ICustomerRepos {
    List<Customer> findAll();
}
