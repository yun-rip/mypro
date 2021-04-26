<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="tf" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page import="com.project.mypro.enums.*"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- 	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
        integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
<link rel="stylesheet" href="/starter-template.css"> -->
<title>Insert title here</title>
</head>

<script>
	//$(document).ready(function(){

	//  $.ajax({
	//        type : "GET", //전송방식을 지정한다 (POST,GET)
	//        url : "/board/form",//호출 URL을 설정한다. GET방식일경우 뒤에 파라티터를 붙여서 사용해도된다.
	//        dataType : "json",//호출한 페이지의 형식이다. xml,json,html,text등의 여러 방식을 사용할 수 있다.
	//        error : function(){
	//            alert("안됨");
	//        }
	//    });
	//});
</script>
<body>
<%-- 	<nav class="navbar navbar-expand-md navbar-dark bg-dark fixed-top" >
        <a class="navbar-brand" href="#">My Project</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault"
            aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarsExampleDefault">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item">
                    <a class="nav-link" href="#" href="/home">홈 <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#" href="/list">게시판 <span class="sr-only">(current)</span></a>
                </li>

            </ul>
            	<sec:authorize access="isAuthenticated()">
                <a class="btn btn-secondary my-2 my-sm-0" href="/login" >Login</a>
                </sec:authorize>
        </div>
    	</nav> --%>

	<tf:select name="지역"/>

	<tf:combo name="나라"/>


</body>
</html>