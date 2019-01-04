package com.mmciel;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FileName
 */

public class FileName extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public FileName() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("filenamekey1");
		
		staticname.key = name;
		staticname.ip = staticname.getRemortIP(request);
		System.out.println("ºóÌ¨key£º"+name);
		staticname.ans = name;
		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println(staticname.ip);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
