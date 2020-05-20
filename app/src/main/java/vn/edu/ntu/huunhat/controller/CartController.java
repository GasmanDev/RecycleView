package vn.edu.ntu.huunhat.controller;

import android.app.Application;

import java.util.ArrayList;
import java.util.List;

import vn.edu.ntu.huunhat.model.Product;

public class CartController extends Application implements ICartController {
    List<Product> productList = new ArrayList<>();

    public CartController() {
        productList.add(new Product("Macbook 1", 50000, "Macbook 2020"));
        productList.add(new Product("Macbook 2", 30000, "Macbook 2020"));
        productList.add(new Product("Macbook 3", 40000, "Macbook 2020"));
        productList.add(new Product("Macbook 4", 20000, "Macbook 2020"));
        productList.add(new Product("Macbook 5", 10000, "Macbook 2020"));
        productList.add(new Product("Macbook 19" , 60000, "Macbook 2020"));
        productList.add(new Product("Macbook 6", 70000, "Macbook 2020"));
        productList.add(new Product("Macbook 77", 80000, "Macbook 2020"));
        productList.add(new Product("Macbook 8", 90000, "Macbook 2020"));
    }

    @Override
    public List<Product> getAllProducts() {
        return productList;
    }
}
