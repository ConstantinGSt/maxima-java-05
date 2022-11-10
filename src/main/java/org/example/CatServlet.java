package org.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import freemarker.template.TemplateException;


@WebServlet("/cat")
public class CatServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
				
		String name = request.getParameter("name");
		String weight = request.getParameter("weight");
		String isAngry = request.getParameter("isAngry");
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter writer = response.getWriter();
		//http://localhost:8080/mywebapp/cat?name=%22Mercuri%22&weight=%225%22&isAngry=%22true%
		writer.write(String.format("<h1> Hello %s</h1><br><h2>Твой вес %s</h2><br><h2>голоден ли ты %s</h2>", name, weight, isAngry));
		writer.close();
		
	}
}
