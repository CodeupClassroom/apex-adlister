package daos;

import interfaces.Products;
import models.Product;

import java.util.ArrayList;
import java.util.List;

public class ListProducts implements Products {

    private List<Product> products = new ArrayList<>();

    // When an instance of this class is created, we'll populate the
    // products array list with data, "faking" the records
    public ListProducts() {
        insert(new Product("hammer", 9.99));
        insert(new Product("screwdriver", 9.99));
        insert(new Product("drill", 19.99));
    }

    // Select * from products
    @Override
    public List<Product> all() {
        return this.products;
    }

    // insert into products (col, col2...) values( val, val2...)
    @Override
    public void insert(Product product) {
        this.products.add(product);
    }

    @Override
    public Product findOne(long id) throws IndexOutOfBoundsException {
        return products.get( (int) (id - 1) );
    }
}
