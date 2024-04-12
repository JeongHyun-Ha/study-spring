<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach begin="1" end="3" var="number">
    <p>반복 출력 코드 ${number}</p>
</c:forEach>
<c:forEach items="${myList}" var="elem">
    <p>${elem}</p>
</c:forEach>
<c:forEach items="${foods}" var="elem" begin="0" end="2">
    <p>${elem}</p>
</c:forEach>
<hr>
<c:forEach items="${myMap}" var="entry">
    <p>${entry.key} : ${entry.value}</p>
</c:forEach>
<hr>
<c:forEach items="${cars}" var="car">
    <p>${car.key} : ${car.value}</p>
</c:forEach>
<hr>
<c:forEach items="${myList2}" var="ele">
    <p>${ele}</p>
</c:forEach>
<c:forEach items="${myMap2}" var="entry">
    <p>${entry.key} : ${entry.value}</p>
</c:forEach>
</body>
</html>
