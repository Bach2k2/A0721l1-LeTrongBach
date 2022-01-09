package service;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    private static Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "Milo", 7, 200, "Sua milo "));
        products.put(2, new Product(2, "DuckLady", 70, 250, "Sua nguyen kem "));
        products.put(3, new Product(3, "Vinamilk", 100, 150, "Sua Vinamilk "));
        products.put(4, new Product(4, "Ovaltine", 120, 120, "Sua Ovaltine "));
        products.put(5, new Product(5, "Yomost", 80, 70, "Sua Yomost "));
        products.put(6, new Product(6, "ChiBy", 150, 75, "Sua moi nhap "));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }

    @Override
    public Product searchByName(String name)
    {
        for(Product product : products.values())
        {
            if(product.getName().equals(name)) return product;
        }
        return null;
    }
}
