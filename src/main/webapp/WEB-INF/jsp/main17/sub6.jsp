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
    <h2>sub6</h2>
    <form action="">
        <div>
            아이디
            <input type="text" name="id">
        </div>
        <div>
            비밀번호
            <input type="text" name="pwd">
        </div>
        <div>
            <button>로그인</button>
        </div>
    </form>
</div>
</body>
</html>
