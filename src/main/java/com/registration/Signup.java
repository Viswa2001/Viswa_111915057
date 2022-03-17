package com.registration;

import java.io.*;

import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Signup extends HttpServlet {

       public void doPost(HttpServletRequest request, HttpServletResponse response)

                     throws ServletException, IOException {        

              String id=request.getParameter("id");   
              String pass=request.getParameter("pass");
              String fname=request.getParameter("fname");
              String lname=request.getParameter("lname");
              String dob=request.getParameter("dob");
              String contact=request.getParameter("contact");

              try{

                     Class.forName("com.mysql.jdbc.Driver");

                     Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employees","root","password");               

                     PreparedStatement ps=con.prepareStatement("insert into viswateja_111915057_detail values(?,?,?,?,?,?)");

                     ps.setString(1,id);    
                     ps.setString(2,pass);
                     ps.setString(3,fname);
                     ps.setString(4,lname);
                     ps.setString(5,dob);
                     ps.setString(6,contact);
                     
                     ps.executeUpdate();
                     
                 
                     ps.close();
                     con.close();
                     response.sendRedirect("login.jsp");


              }catch (Exception e2)

                {

                    e2.printStackTrace();

                }

       }


}