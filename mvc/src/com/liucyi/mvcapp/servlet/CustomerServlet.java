package com.liucyi.mvcapp.servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.mail.Address;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CustomerServlet
 */
@WebServlet("*.do")
public class CustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CustomerServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	// protected void doPost(HttpServletRequest request,
	// HttpServletResponse response) throws ServletException, IOException {
	// String method = request.getParameter("method");
	// switch (method) {
	// case "add":
	// add(request, response);
	// break;
	// case "query":
	// query(request, response);
	// break;
	// case "delete":
	// delete(request, response);
	// break;
	//
	// }
	// }
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String serlvetPath = req.getServletPath();
		String methodNameString = serlvetPath.substring(1);
		methodNameString = methodNameString.substring(0,
				methodNameString.length() - 3);
		try {
			Method method = getClass().getDeclaredMethod(methodNameString,
					HttpServletRequest.class, HttpServletResponse.class);
			method.invoke(this, req, resp);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private void edit(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("edit");

	}
	private void delete(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("delete");

	}

	private void query(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("query");

	}

	private void addCustomer(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("add");

	}

}
