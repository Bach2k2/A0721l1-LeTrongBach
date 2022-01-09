package service;

import model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerService implements ICustomerService {
    public static List<Customer> customerService = new ArrayList<>();

    static {
        customerService.add(new Customer("Mai Thị Loan", "1994-9-7", "Hà Nội", "https://cdn.vnexplorer.net/img/2020/7/21/02cd273339d9221b2117ce81d7763e55.jpg?v=1.0"));
        customerService.add(new Customer("Nguyễn Văn Nam", "1996-9-8", "Hải Phòng", "https://th.bing.com/th/id/OIP.LtAVuxO5GwOvVj7EBffCxgHaHa?pid=ImgDet&w=204&h=204&c=7&dpr=1.5"));
        customerService.add(new Customer("Nguyễn Thái Hòa", "1983-9-9", "Nam Định", "https://th.bing.com/th/id/OIP.q8IHqCG8rYFdjuO2qX5WCgC7FN?w=186&h=331&c=7&r=0&o=5&dpr=1.5&pid=1.7"));
        customerService.add(new Customer("Trần Đăng Khoa", "1983-9-5", "Bắc Cạn", "https://th.bing.com/th/id/OIF.Q4SaZu6NHFNnCLG9u899uw?w=186&h=233&c=7&r=0&o=5&dpr=1.5&pid=1.7"));
        customerService.add(new Customer("Nguyễn Đình Thi", "1983-9-17", "Hạ Long", "https://th.bing.com/th/id/OIP.2qeEPUZpvbhuqtsQ_XVRKwHaJN?w=186&h=231&c=7&r=0&o=5&dpr=1.5&pid=1.7"));
    }

    @Override
    public List<Customer> findAll() {
        return customerService;
    }
}
