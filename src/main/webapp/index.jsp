<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//context명이 바뀔수도 있기 때문에 직접 입력하는 것보다 이어주는게 좋음  
	response.sendRedirect(request.getContextPath()+"/list.do");
%>