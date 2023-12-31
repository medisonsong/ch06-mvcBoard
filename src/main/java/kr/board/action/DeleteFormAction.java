package kr.board.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.controller.Action;

public class DeleteFormAction implements Action{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//전송된 데이터 받기
		int num = Integer.parseInt(request.getParameter("num"));
		request.setAttribute("num", num);
		
		//JSP 경로 반환
		return "/WEB-INF/views/deleteForm.jsp";
		//위 셋팅 없이 ${param.num} 이라고 받아도 됨
	}
}
