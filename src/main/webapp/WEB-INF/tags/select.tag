<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ tag trimDirectiveWhitespaces="true"%>
<%@ tag dynamic-attributes="optionMap"%>
<%@ attribute name="name" required="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ tag import="com.project.mypro.enums.*"%>

<%-- <select name="${name}" >
	<c:forEach items="${optionMap}" var="op">
	<option value="${op.key}">${op.value}</option>	
	</c:forEach>
</select> --%>

<select name="${name}">

	<c:forEach items="${M001.values()}" var="M00">
		<option value="지역">${M00.SOO}</option>
	</c:forEach>

</select>