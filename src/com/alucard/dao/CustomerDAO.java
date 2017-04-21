package com.alucard.dao;

import com.alucard.entity.Customer;

import java.util.List;

/**
 * Created by Alucard on 21-Apr-17.
 */
public interface CustomerDAO {

  public List<Customer> getCustomers();
}
