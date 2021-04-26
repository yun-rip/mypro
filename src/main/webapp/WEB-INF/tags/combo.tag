<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ tag trimDirectiveWhitespaces="true"%>
<%@ tag dynamic-attributes="valueMap"%>
<%@ attribute name="name" required="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ tag import="com.project.mypro.enums.*"%>


<c:forEach items="${M002.values()}" var="M00">
	<input type="checkbox" name="${name}" value="나라">${M00.country} &nbsp;
</c:forEach>