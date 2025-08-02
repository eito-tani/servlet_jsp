package psj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PracticeAverageServlet extends HttpServlet {
		public void doGet(HttpServletRequest request, HttpServletResponse responce) 
			throws ServletException, IOException{
			
			int A = 100;
			int B = 80;
			int C = 45;
			PrintWriter out = responce.getWriter();
			out.println("Average Test Scores:" + (A+B+C) /3);
			
		}

}
