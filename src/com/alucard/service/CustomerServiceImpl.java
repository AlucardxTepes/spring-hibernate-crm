package com.alucard.service;

import com.alucard.dao.CustomerDAO;
import com.alucard.entity.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Alucard on 21-Apr-17.
 */
@Service
public class CustomerServiceImpl implements CustomerService {

  @Autowired
  CustomerDAO mCustomerDAO;

  @Override
  public List<Customer> getCustomers() {
    return mCustomerDAO.getCustomers();
  }
}