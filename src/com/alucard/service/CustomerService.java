package com.alucard.service;

import com.alucard.entity.Customer;

import java.util.List;

/**
 * Created by Alucard on 21-Apr-17.
 */
public interface CustomerService {
  List<Customer> getCustomers();
  void saveCustomer(Customer c);
}
