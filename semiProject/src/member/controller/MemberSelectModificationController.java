package com.semi.member.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MemberSelectModificationController
 */
@WebServlet("/selectModification.me")
public class MemberSelectModificationController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public MemberSelectModificationController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("views/member/memberSelectModification.jsp").forward(request, response);
	}
}













