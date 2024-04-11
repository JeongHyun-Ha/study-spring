<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach begin="0" end="5" var="num">
    <p>반복 출력할 코드 ${num}</p>
</c:forEach>
<hr>
<h3>구구단 ${dan}단</h3>
<c:forEach begin="1" end="9" var="num">
    <p>${dan} X ${num} = ${dan * num}</p>
</c:forEach>
<h3>구구단 ${dan}단 거꾸로</h3>
<c:forEach begin="1" end="9" var="num">
    <p>${dan} X ${10 - num} = ${(10 - num) * dan}</p>
</c:forEach>
</body>
</html>
