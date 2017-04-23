package com.alucard.dao;

import com.alucard.entity.Customer;

import java.util.List;

/**
 * Created by Alucard on 21-Apr-17.
 */
public interface CustomerDAO {

  List<Customer> getCustomers();
  void saveCustomer(Customer c);
  Customer getCustomer(int id);
  void deleteCustomer(int id);
}
