package com.alucard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Alucard on 20-Apr-17.
 */
@Controller
@RequestMapping("/customer")
public class CustomerController {

  @RequestMapping("/list")
  public String listCustomers(Model m) {
    return "list-customers";
  }

}
