<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%-- el의 내장 객체 param : request parameter 를
     key, value 쌍으로 저장한 Map                 --%>
<div>${param.name}</div>
<div>${param.age}</div>
<div>${param.city}</div>
<div>${param.address}</div>
<div>${param.model}</div>
</body>
</html>
