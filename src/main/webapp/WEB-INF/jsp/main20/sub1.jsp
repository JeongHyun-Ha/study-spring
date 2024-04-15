<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <%-- Text Input --%>
    <input type="text">
</div>
<div>
    <%-- 수 입력 --%>
    <input type="number">
</div>
<div>
    <%-- 날짜 입력 --%>
    <input type="date">
</div>
<div>
    <%--    날짜 시간 입력--%>
    <input type="datetime-local">
</div>
<div>
    <%--    파일 입력--%>
    <input type="file">
</div>
<div>
    <%--    암호 입력--%>
    <input type="password">
</div>
<div>
    <%--    radio 버튼--%>
    <%--    div*3>input[type=radio]--%>
    <div>
        <input type="radio" name="food">
        바나나
        <input type="radio" name="food">
        딸기
        <input type="radio" name="food">
        사과
    </div>
</div>
<div>
    <%--    div>input[type=checkbox][name=food]*3>lorem1--%>
    <div>
        <input type="checkbox" name="food">
        Lorem.
        <input type="checkbox" name="food">
        Officiis.
        <input type="checkbox" name="food">
        Architecto.
    </div>
</div>
<div>
    <input type="month">
</div>

</body>
</html>
