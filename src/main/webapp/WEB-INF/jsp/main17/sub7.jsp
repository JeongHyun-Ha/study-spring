<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:import url="/WEB-INF/fragment/navbar4.jsp">
    <c:param name="current" value="sub8"/>
</c:import>

<div>
    <h2>sub7</h2>
    <h3>${sessionScope.id}</h3>
</div>
</body>
</html>