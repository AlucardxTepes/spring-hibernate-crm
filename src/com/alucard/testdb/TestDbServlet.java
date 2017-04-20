package com.alucard.testdb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.annotation.WebServlet;

/**
 * Created by Alucard on 20-Apr-17.
 */
@WebServlet("/TestDbServlet")
public class TestDbServlet extends javax.servlet.http.HttpServlet {

  protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet
          .ServletException, IOException {

    // setup connection variables
    String user = "springstudent";
    String pass = "springstudent";
    String jdbcUrl = "jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false";
    String driver = "com.mysql.jdbc.Driver";

    // get a connection to the database
    try {
      PrintWriter out = response.getWriter();
      out.println("Connecting to database: " + jdbcUrl);
      Class.forName(driver);
      Connection myConn = DriverManager.getConnection(jdbcUrl, user, pass);
      out.println("Connection successful.");
      myConn.close();

    } catch (Exception e) {
      e.printStackTrace();
    }


  }
}
