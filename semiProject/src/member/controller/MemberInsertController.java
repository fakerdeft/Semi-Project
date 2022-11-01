package com.semi.member.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.semi.member.model.service.MemberService;
import com.semi.member.model.vo.Member;

/**
 * Servlet implementation class MemberEnrollForm
 */
@WebServlet("/insert.me")
public class MemberInsertController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public MemberInsertController() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		String memId = request.getParameter("memId");
		String memPw = request.getParameter("memPw");
		String memName = request.getParameter("memName");
		String memEmail = request.getParameter("memEmail");
		String memPhone = request.getParameter("memPhone");
		String memAddress = request.getParameter("memAddress");
		
		Member m = new Member(memId,memPw,memName,memEmail,memPhone,memAddress);
		
		
		int result = new MemberService().insertMember(m);
		
		if(result>0) {
			HttpSession session = request.getSession();
			RequestDispatcher view = request.getRequestDispatcher("views/member/memberEnrollForm3.jsp");
			view.forward(request, response);
		}
		
		else {		
			HttpSession session = request.getSession();
			session.setAttribute("alertMsg", "이미 존재하는 유저입니다.");
			response.sendRedirect(request.getContextPath());
		}
	}

}
