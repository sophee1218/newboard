package servlet;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BoardServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		response.setContentType("text/html;charset=utf-8");
		PrintWriter pw = response.getWriter();
		String str = "Get으로 오셨군요";
		String name = request.getParameter("name");
		str += "name = " + name;
		pw.print(str);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		PrintWriter pw = response.getWriter();
		String str = "Post로 오셨군요";
		String name = request.getParameter("name");
		str += "name = " + name;
		pw.print(str);
	}

}
