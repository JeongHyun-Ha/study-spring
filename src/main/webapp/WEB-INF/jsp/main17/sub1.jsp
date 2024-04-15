<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    name : ${requestScope.name}
    <br>

    city : ${sessionScope.city}
</div>
<hr>
<div>
    model : ${model}
    <br>
    model : ${requestScope.model}
    <br>
    model : ${sessionScope.model}
</div>
</body>
</html>
