package service;

import model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();

    void save(Customer customer);

    public int findIndexById(int id);

    public void update(int index, Customer customer);

    public void remove(int index);

    public Customer findById(int id);
}
