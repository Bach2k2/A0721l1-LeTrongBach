package service;

import model.Product;

import java.util.List;

public interface IProductService {
    List<Product> getAllProducts();

    void createProduct(Product product);

    Product getById(int id);

    void updateProduct(Product product);

    void deleteProduct(Product product);

}
