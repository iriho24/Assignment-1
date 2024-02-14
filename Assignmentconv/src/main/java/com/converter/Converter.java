package com.converter;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class Converter extends HttpServlet{
	  public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        String numberStr = request.getParameter("number");
	        if (numberStr != null && !numberStr.isEmpty()) {
	            int number = Integer.parseInt(numberStr);
	            if (request.getParameter("binary") != null) {
	                String binary = Integer.toBinaryString(number);
	                response.getWriter().println("Binary: " + binary);
	            } else if (request.getParameter("hexadecimal") != null) {
	                String hexadecimal = Integer.toHexString(number);
	                response.getWriter().println("Hexadecimal: " + hexadecimal.toUpperCase());
	            } else if (request.getParameter("octal") != null) {
	                String octal = Integer.toOctalString(number);
	                response.getWriter().println("Octal: " + octal);
	            } else if (request.getParameter("clear") != null) {
	                // Clear input
	                response.sendRedirect("index.html");
	            }
	        }
	    }
	}