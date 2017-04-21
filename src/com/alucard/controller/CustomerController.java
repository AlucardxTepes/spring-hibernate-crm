package com.alucard.controller;

import com.alucard.dao.CustomerDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Alucard on 20-Apr-17.
 */
@Controller
@RequestMapping("/customer")
public class CustomerController {

  // inject customerDAO
  @Autowired
  CustomerDAO mCustomerDAO;

  @RequestMapping("/list")
  public ModelAndView listCustomers() {
    ModelAndView modelAndView = new ModelAndView();
    // get customers from the DAO
    modelAndView.addObject("customers", mCustomerDAO.getCustomers());
    modelAndView.setViewName("list-customers");

    // add customers to the model
    return modelAndView;
  }

}
