package com.semi.member.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.semi.member.model.service.MemberService;
import com.semi.member.model.vo.Member;
import com.semi.member.model.vo.Order;

/**
 * Servlet implementation class NoMemberLoginController
 */
@WebServlet("/nologin.me")
public class NoMemberLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public NoMemberLoginController() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		String reciverName = request.getParameter("reciverName");
		String orderNo = request.getParameter("orderNo");

		Order loginNoMem = new MemberService().loginNoMember(reciverName, orderNo);
		
		if(loginNoMem != null) {
			HttpSession session = request.getSession();
			session.setAttribute("loginNoMem", loginNoMem);
			response.sendRedirect(request.getContextPath());
		}
		else {
			HttpSession session = request.getSession();
			session.setAttribute("alertMsg", "로그인 실패!");
			response.sendRedirect(request.getContextPath()+"/loginview.me");
		}
	}

}
