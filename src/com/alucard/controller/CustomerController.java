package com.alucard.controller;

import com.alucard.entity.Customer;
import com.alucard.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
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
  CustomerService mCustomerService;

  @GetMapping("/list")
  public ModelAndView listCustomers() {
    ModelAndView modelAndView = new ModelAndView(
            "list-customers",
            "customers", mCustomerService.getCustomers());
    return modelAndView;
  }

  @GetMapping("/showFormForAdd")
  public String showFormForAdd(Model m) {
    Customer c = new Customer();
    m.addAttribute("customer", c);
    return "customer-form";
  }

  @PostMapping("/saveCustomer")
  public String saveCustomer(@ModelAttribute("customer") Customer c) {

    // Save the customer using our service
    mCustomerService.saveCustomer(c);

    return "redirect:/customer/list";
  }

}
