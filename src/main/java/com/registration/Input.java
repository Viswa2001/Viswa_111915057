package com.registration;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Input extends HttpServlet {

       public void doPost(HttpServletRequest request, HttpServletResponse response) 

                     throws ServletException, IOException {        

              String id=request.getParameter("id");   
              String job=request.getParameter("job");
              String salary=request.getParameter("salary");
              String bonus=request.getParameter("bonus");
              

              try{

                     Class.forName("com.mysql.jdbc.Driver");

                     Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employees","root","password");               

                     PreparedStatement ps=con.prepareStatement("insert into viswateja_111915057_salary values(?,?,?,?)");

                     ps.setString(1,id);    
                     ps.setString(2,job);
                     ps.setString(3,salary);
                     ps.setString(4,bonus);
                     
                     
                     ps.executeUpdate();
           
                     ps.close();
                     
               
                     con.close();
                     response.sendRedirect("report.jsp");


              }catch (Exception e2)

                {

                    e2.printStackTrace();

                }

       }


}



