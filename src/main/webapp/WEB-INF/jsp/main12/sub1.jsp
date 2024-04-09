<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>if</h3>
<c:if test="${age >= 20}"> <%-- Jsp Standart Tag Library(JSTL) --%>
    <p>투표 가능</p>
</c:if>
<c:if test="${age < 20}">
    <p>투표 불가능</p>
</c:if>

<c:if test="${empty products}" var="result">
    <p>상품이 없습니다.</p>
</c:if>
<c:if test="${not result}">
    <ul>
        <li>${products[0]}</li>
        <li>${products[1]}</li>
    </ul>
</c:if>
<hr>
<c:if test='${member.country =="korea" and member.age >= 20}' var="result2">
    <p>투표 가능</p>
</c:if>
<c:if test="${! result2}">
    <p>투표 불가능</p>
</c:if>
</body>
</html>
