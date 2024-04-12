<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%-- /로 시작하지 않으면 상대 경로(현재경로 기준) --%>
<%-- /WEB-INF/jsp/main16/navbar1.jsp --%>
<c:import url="navbar1.jsp"/>

<%-- /로 시작하면 절대 경로--%>
<c:import url="/WEB-INF/jsp/main16/navbar1.jsp"/>

<div>
    sub1
</div>
<c:import url="../../fragment/footer1.jsp"/>
<c:import url="/WEB-INF/fragment/footer1.jsp"/>
</body>
</html>
