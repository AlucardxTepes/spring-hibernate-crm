package com.alucard.dao;

import com.alucard.entity.Customer;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Alucard on 21-Apr-17.
 */
@Repository
public class CustomerDAOImpl implements CustomerDAO {

  // inject the session factory
  @Autowired
  private SessionFactory mSessionFactory;

  @Override
  @Transactional
  public List<Customer> getCustomers() {
    // get hibernate session
    Session currentSession = mSessionFactory.getCurrentSession();
    // create query
    Query<Customer> q = currentSession.createQuery("from Customer order by lastName", Customer.class);
    // execute query and get results
    List<Customer> customers = q.getResultList();
    // return the results
    return customers;
  }

  @Override
  @Transactional
  public void saveCustomer(Customer c) {
    // get hibernate session and save the customer
    Session currentSession = mSessionFactory.getCurrentSession();
    currentSession.save(c);
  }
}
