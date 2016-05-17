package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.*;

public class DeleteProAction implements CommandProcess{
	public String requestPro(HttpServletRequest request, HttpServletResponse response) {
		int num = Integer.parseInt(request.getParameter("num"));
		String pageNum = request.getParameter("pageNum");
		BoardDao bd = BoardDao.getInstance();
		int result  = bd.delete(num);
	
		request.setAttribute("num", num);
		request.setAttribute("pageNum", pageNum);
		request.setAttribute("result", result);
		
		return "deletePro.jsp";
	}

}
