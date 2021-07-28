package com.example.javasedemo.java8.stream;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @Description 传统dto  复制与java 8 之间的比较
 * @Author lktbz
 * @Date 2021/07/28
 */
public class StreamMapTest {
    public static void main(String[] args) {

        // Convert entity to DTO using Set
        final Set<Customer> customers = new HashSet<>();
        customers.add(new Customer(100, "customer", "lastname1"));
        customers.add(new Customer(200, "customer2", "lastname2"));
        customers.add(new Customer(300, "customer3", "lastname3"));
        customers.add(new Customer(400, "customer4", "lastname4"));

        final Set<CustomerDTO> customerDTOs =
                customers.stream().map(c ->{
                    final CustomerDTO customerDTO =
                            new CustomerDTO(c.getId(), c.getFirstName(), c.getLastName());
                    return customerDTO;
                }).collect(Collectors.toSet());

        customerDTOs.forEach( c -> System.out.println(c.getId()));

        // Convert entity to DTO using List
        final List<Customer> list = new ArrayList<>();
        list.add(new Customer(100, "customer", "lastname1"));
        list.add(new Customer(200, "customer2", "lastname2"));
        list.add(new Customer(300, "customer3", "lastname3"));
        list.add(new Customer(400, "customer4", "lastname4"));

        final List<CustomerDTO> dtos = list.stream().map(c ->{
            final CustomerDTO customerDTO =
                    new CustomerDTO(c.getId(), c.getFirstName(), c.getLastName());
            return customerDTO;
        }).collect(Collectors.toList());

        dtos.forEach( c -> System.out.println(c.getId()));
    }

    /**
     * 传统方式
     * @return
     */
    private static Set<CustomerDTO> BeforeJava8Demo(){
        final Set<Customer> customers = new HashSet<>();
        customers.add(new Customer(100, "customer", "lastname1"));
        customers.add(new Customer(200, "customer2", "lastname2"));
        customers.add(new Customer(300, "customer3", "lastname3"));
        customers.add(new Customer(400, "customer4", "lastname4"));
        final Set<CustomerDTO> customerDTOs = new HashSet<>();
        for(Customer customer : customers){
            customerDTOs.add(new CustomerDTO(customer.getId(),
                    customer.getFirstName(),customer.getLastName()));
        }

        for(CustomerDTO customerDTO : customerDTOs){
            System.out.println(customerDTO.getId());
        }
        return customerDTOs;
    }

    private static Set<CustomerDTO> java8StreamAPIDemo(){
        final Set<Customer> customers = new HashSet<>();
        customers.add(new Customer(100, "customer", "lastname1"));
        customers.add(new Customer(200, "customer2", "lastname2"));
        customers.add(new Customer(300, "customer3", "lastname3"));
        customers.add(new Customer(400, "customer4", "lastname4"));

        final Set<CustomerDTO> customerDTOs = customers.stream().map(c ->{
            final CustomerDTO customerDTO = new CustomerDTO(c.getId(),
                    c.getFirstName(), c.getLastName());
            return customerDTO;
        }).collect(Collectors.toSet());

        customerDTOs.forEach( c -> System.out.println(c.getId()));
        return customerDTOs;
    }
}