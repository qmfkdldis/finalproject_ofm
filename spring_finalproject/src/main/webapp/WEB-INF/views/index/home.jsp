<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<style type="text/css">
	#main_middle{
		width: 1100px;
		background-color: blue;
		height: 1000px;
		margin: 20px 160px;
	}
</style>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<div id="main_middle"></div>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
