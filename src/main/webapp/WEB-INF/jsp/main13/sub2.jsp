<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:url value="https://search.naver.com/search.naver" var="naverUrl">
    <c:param name="query" value="bts"/>
    <c:param name="name" value="asdf"/>
</c:url>
<a href="${naverUrl}">네이버</a>
<hr>
<%--https://search.daum.net/search?w=tot&DA=YZR&t__nil_searchbox=btn&q=%EC%97%90%EC%8A%A4%ED%8C%8C--%>
<c:url value="https://search.daum.net/search" var="daumUrl">
    <c:param name="w" value="tot"/>
    <c:param name="DA" value="YZR"/>
    <c:param name="t__nil_searchbox" value="btn"/>
    <c:param name="q" value="에스파"/>
</c:url>
<a href="${daumUrl}">다음</a>
</body>
</html>
