<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%-- set : attribute 추가 --%>
<c:set var="attr1" value="손흥민"/>
<p>${attr1}</p>
<c:set var="attr2" value="이강인"/>
<p>${attr2}</p>
<c:set target="${obj1}" property="address" value="강남"/>
<c:set target="${obj1}" property="age" value="121212"/>
<p>${obj1.address}</p>
<p>${obj1.city}</p>
<p>${obj1.age}</p>
</body>
</html>
