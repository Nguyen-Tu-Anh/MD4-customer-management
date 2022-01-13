package service;

import model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerService implements ICustomerService {
    private static final List<Customer> customers;

    static {

        customers = new ArrayList<>();
        customers.add(new Customer(1, "John", "john@codegym.vn", "Hanoi"));
        customers.add(new Customer(2, "Bill", "bill@codegym.vn", "Danang"));
        customers.add(new Customer(3, "Alex", "alex@codegym.vn", "Saigon"));
        customers.add(new Customer(4, "Adam", "adam@codegym.vn", "Beijin"));
        customers.add(new Customer(5, "Sophia", "sophia@codegym.vn", "Miami"));
        customers.add(new Customer(6, "Rose", "rose@codegym.vn", "Newyork"));
    }

    @Override
    public List<Customer> findAll() {
        return customers;
    }

    @Override
    public void save(Customer customer) {
        customers.add(customer);
    }

    @Override
    public int findIndexById(int id) {
        for (int i = 0; i < customers.size(); i++) {
            if(customers.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public Customer findById(int id) {
        for (int i = 0; i < customers.size(); i++) {
            if(customers.get(i).getId() == id) {
                return customers.get(i);
            }
        }
        return null;
    }

    @Override
    public void update(int index, Customer customer) {
        customers.set(index, customer);
    }

    @Override
    public void remove(int index) {
        customers.remove(index);
    }
}