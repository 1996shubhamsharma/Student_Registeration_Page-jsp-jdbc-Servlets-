package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.model.Model;


@WebServlet("/Controller")
public class Controller extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String name = req.getParameter("name");
		String sid = req.getParameter("sid");
		String clg = req.getParameter("clg");
		String a = req.getParameter("age");
		int age = Integer.parseInt(a);
		String m = req.getParameter("marks");
		int marks = Integer.parseInt(m);
		
		try {
			Model m = new Model();
			m.setName(name);
			m.setSid(sid);
			m.setClg(clg);

			boolean b=m.insert();
			if(b==true)
			{
				RequestDispatcher reqd = req.getRequestDispatcher("/success.htm");
				reqd.forward(req, res);
			}
			else
			{
				RequestDispatcher reqd = req.getRequestDispatcher("/fail.htm");
				reqd.forward(req, res);
			}
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
}
