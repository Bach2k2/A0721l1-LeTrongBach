package service;

import model.Customer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CustomerService implements ICustomerService{
   public static List<Customer> customerList=new LinkedList<>();
    static{
        customerList.add(new Customer("Lê Văn Hà","19-7-2002","Đà Nẵng","https://www.googleadservices.com/pagead/aclk?sa=L&ai=CXi-awvbaYb-WNYSavwTcg7DgBpn27NJnpLfrgfcO58Op5q8aEAEg1MmXfmDBBaAB2N6u3wPIAQmpAtPkr0hANsg9qAMByAPLBKoEhwJP0G5E9QWPAqsnLi5jIeK-sJi65gmkbWJpjmou4QpcslD7Jl3K6gTTNflv6VNsNNtqAI3mms9xBSWYWFXgVjBF7tZq0OfhzVqvQqLxjsCdZTCInXzFbbtuWvrQxabPLV71V-ONGDzkQvC-cMi1P-v93_ZzE8iHSp3hSoWTd0MVxsyzU6_nB71y6eSaSKu7yV2aGD0bwVV_tBVe5yn1_AgJ_p_8fktAJE9k_dP-paDmtfGTM4jUp06-Sm_Wf0fwCWtb1TxljIe94lFGWkK4lqAZpcw4LnXbDmIDG0EferLWkbT17cuma0LNJuJETaFIrUZ3dFullbx2Lhp9hnyAxmgr8POhESh4rsAEkr-J7dUD-gUGCCUQARgCkAYBoAYugAeQodEgiAcBkAcCqAeOzhuoB5PYG6gH7paxAqgH_p6xAqgHpr4bqAfz0RuoB5bYG6gHqpuxAqgH35-xAtgHAMAIA9IIBggAEAIYGoAKAZALA5gLAcgLAYAMAbgMAdgTAtAVAZgWAYAXAQ&ae=1&num=1&cid=CAMSeQClSFh3kAqAYYtIem5iEU0C2W7lHbYn67acGYDymZP9igiIxR-Kv3hNuHcf4hjUgfyjRDVpEhLX2IGUcIOZL33x7qf1HrIvax_s_ND8lHbnAvPxfOMPnAYpQvRTQlX-py15kMHVdKo3rvoEthYXMJE0HBFzSKcd4KQ&sig=AOD64_0V3YmCeMTGuhcdCK7p7bVoL97_tw&client=ca-pub-9738390799017847&nb=9&adurl=https://laptopre.vn/laptop/dell-inspiron-5406-2in1%3Fgclid%3DCjwKCAiArOqOBhBmEiwAsgeLmfZBL9Dx9nRKw4STotv8WNfOuGh0XWf_WWqgaSn9da2fW64cixyelhoCBHIQAvD_BwE"));
        customerList.add(new Customer("Lê Văn Hiếu","19-3-2002","Đà Nẵng","https://allimages.sgp1.digitaloceanspaces.com/photographercomvn/2020/08/1596889688_576_Anh-avatar-dep-va-doc-dao-lam-hinh-dai-dien.jpg"));
        customerList.add(new Customer("Nguyễn Văn Bin","19-5-2002","Đà Nẵng","https://allimages.sgp1.digitaloceanspaces.com/photographercomvn/2020/08/1596889691_845_Anh-avatar-dep-va-doc-dao-lam-hinh-dai-dien.png"));
        customerList.add(new Customer("Trần Duy Hứa","19-7-2002","Đà Nẵng","https://www.googleadservices.com/pagead/aclk?sa=L&ai=CPAXgwvbaYb-WNYSavwTcg7DgBpn27NJnpLfrgfcO58Op5q8aEAEg1MmXfmDBBaAB2N6u3wPIAQmpAtPkr0hANsg9qAMByAPLBKoEhwJP0G5E9QWPAqsnLi5jIeK-sJi65gmkbWJpjmou4QpcslD7Jl3K6gTTNflv6VNsNNtqAI3mms9xBSWYWFXgVjBF7tZq0OfhzVqvQqLxjsCdZTCInXzFbbtuWvrQxabPLV71V-ONGDzkQvC-cMi1P-v93_ZzE8iHSp3hSoWTd0MVxsyzU6_nB71y6eSaSKu7yV2aGD0bwVV_tBVe5yn1_AgJ_p_8fktAJE9k_dP-paDmtfGTM4jUp06-Sm_Wf0fwCWtb1TxljIe94lFGWkK4lqAZpcw4LnXbDmIDG0EferLWkbT17cuma0LNJuJETaFIrUZ3dFullbx2Lhp9hnyAxmgr8POhESh4rsAEkr-J7dUD-gUGCCUQARgBkAYBoAYugAeQodEgiAcBkAcCqAeOzhuoB5PYG6gH7paxAqgH_p6xAqgHpr4bqAfz0RuoB5bYG6gHqpuxAqgH35-xAtgHAMAIAtIIBggAEAIYGoAKAZALA5gLAcgLAYAMAbgMAdgTAtAVAZgWAYAXAQ&ae=1&num=1&cid=CAMSeQClSFh3bNk4C3Zlek65MmP9poCX-3dOheJVI0RqNyS999BHUWgBiOHfzJiobfdim8RYeAoUq8JDNoazCaxLXo61GUCNlFlp4CcOZlelu3R8ebZhnCoSfrTF2zJuJVMUqV4wY7knS4jdv5NkAD5SQXWqb4ETf54RzL4&sig=AOD64_00NVDNVitKQ0GugM4CCxo9JBBrmw&client=ca-pub-9738390799017847&nb=9&adurl=https://laptopre.vn/laptop/lenovo-thinkpad-p53s%3Fgclid%3DCjwKCAiArOqOBhBmEiwAsgeLmQcx9HmYwXlmeY3JeYWcy-MujCBLdihRncZvrBW8-hpYlwgcMwA_xBoC988QAvD_BwE"));
        customerList.add(new Customer("Lê Thị Kim Tiên","19-11-2002","Đà Nẵng","https://www.googleadservices.com/pagead/aclk?sa=L&ai=CXi-awvbaYb-WNYSavwTcg7DgBpn27NJnpLfrgfcO58Op5q8aEAEg1MmXfmDBBaAB2N6u3wPIAQmpAtPkr0hANsg9qAMByAPLBKoEhwJP0G5E9QWPAqsnLi5jIeK-sJi65gmkbWJpjmou4QpcslD7Jl3K6gTTNflv6VNsNNtqAI3mms9xBSWYWFXgVjBF7tZq0OfhzVqvQqLxjsCdZTCInXzFbbtuWvrQxabPLV71V-ONGDzkQvC-cMi1P-v93_ZzE8iHSp3hSoWTd0MVxsyzU6_nB71y6eSaSKu7yV2aGD0bwVV_tBVe5yn1_AgJ_p_8fktAJE9k_dP-paDmtfGTM4jUp06-Sm_Wf0fwCWtb1TxljIe94lFGWkK4lqAZpcw4LnXbDmIDG0EferLWkbT17cuma0LNJuJETaFIrUZ3dFullbx2Lhp9hnyAxmgr8POhESh4rsAEkr-J7dUD-gUGCCUQARgCkAYBoAYugAeQodEgiAcBkAcCqAeOzhuoB5PYG6gH7paxAqgH_p6xAqgHpr4bqAfz0RuoB5bYG6gHqpuxAqgH35-xAtgHAMAIA9IIBggAEAIYGoAKAZALA5gLAcgLAYAMAbgMAdgTAtAVAZgWAYAXAQ&ae=1&num=1&cid=CAMSeQClSFh3kAqAYYtIem5iEU0C2W7lHbYn67acGYDymZP9igiIxR-Kv3hNuHcf4hjUgfyjRDVpEhLX2IGUcIOZL33x7qf1HrIvax_s_ND8lHbnAvPxfOMPnAYpQvRTQlX-py15kMHVdKo3rvoEthYXMJE0HBFzSKcd4KQ&sig=AOD64_0V3YmCeMTGuhcdCK7p7bVoL97_tw&client=ca-pub-9738390799017847&nb=9&adurl=https://laptopre.vn/laptop/dell-inspiron-5406-2in1%3Fgclid%3DCjwKCAiArOqOBhBmEiwAsgeLmfZBL9Dx9nRKw4STotv8WNfOuGh0XWf_WWqgaSn9da2fW64cixyelhoCBHIQAvD_BwE"));
    }
    public List<Customer> findAll()
    {
        return customerList;
    }
}
