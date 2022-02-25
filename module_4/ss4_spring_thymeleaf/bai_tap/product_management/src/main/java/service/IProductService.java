package service;

import model.Product;

import java.util.List;
import java.util.Map;

public interface IProductService {
    List<Product> getAllProducts();

    void createProduct(Product product);

    Product getById(int id);

    void updateProduct(Product product);

    void deleteProduct(int id);

}
