package com.example.javasedemo.java8;

import org.junit.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * @Description 函数接口之Supplier
 * @Author lktbz
 * @Date 2021/07/27
 */
public class SupplierDemo {
    @Test
    public void test01() {
       Supplier<LocalDateTime> supplier= () -> LocalDateTime.now();
       System.out.println(supplier.get());
    }
    @Test
    public void test02() {
        System.out.println(productSupplier().get());
    }
private static Supplier<List<Product>>productSupplier(){
    Supplier < List < Product >> productSupplier=    ()->{
        List<Product>productsList=new ArrayList<>();
        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Dell Laptop", 30000f));
        productsList.add(new Product(3, "Lenevo Laptop", 28000f));
        productsList.add(new Product(4, "Sony Laptop", 28000f));
        productsList.add(new Product(5, "Apple Laptop", 90000f));
        productsList.add(new Product(6, "Apple Laptop", 90000f));
        productsList.add(new Product(7, "Dell Laptop", 30000f));
        productsList.add(new Product(8, "Dell Laptop", 30000f));
        return productsList;
    };
    return productSupplier;
}
}
class Product {
    private int id;
    private String name;
    private float price;

    public Product(int id, String name, float price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
    }
}