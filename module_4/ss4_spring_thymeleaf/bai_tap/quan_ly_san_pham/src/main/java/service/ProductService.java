package service;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService implements IProductService {
    private static Map<Integer, Product> productMap;
    private static int quantifier = productMap.size();

    static {
        productMap = new HashMap<>();
        productMap.put(1, new Product(1, "Vicic", "Honda", "VIC", 24.25, "4 Doors, 5 seats"));
        productMap.put(2, new Product(2, "Mirage", "Mitsubishi", "ES MT", 14.99, "5 Doors, 5 seats"));
        productMap.put(3, new Product(3, "Vicic", "Honda", "VIC", 24.25, "4 Doors, 5 seats"));
        productMap.put(4, new Product(4, "Vicic", "Honda", "VIC", 24.25, "4 Doors, 5 seats"));
        productMap.put(5, new Product(5, "Vicic", "Honda", "VIC", 24.25, "4 Doors, 5 seats"));


    }

    @Override
    public List<Product> getAllProducts() {
        List<Product> products = new ArrayList<>();
        products = (List<Product>) productMap.values();
        return products;
    }

    @Override
    public void createProduct(Product product) {
        productMap.put(product.getId(), product);
    }

    @Override
    public Product getById(int id) {
        return productMap.get(id);
    }

    @Override
    public void updateProduct(Product product) {
        int id = product.getId();
        productMap.put(id, product);
    }

    @Override
    public void deleteProduct(Product product) {
        productMap.remove(product.getId());
    }

}
