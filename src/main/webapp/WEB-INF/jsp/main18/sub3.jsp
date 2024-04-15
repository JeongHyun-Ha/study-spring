<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>상품 : 마우스</title>
</head>
<body>
<c:import url="/WEB-INF/fragment/navbar5.jsp">
    <c:param name="current" value="mouse"/>
</c:import>
<h3>마우스</h3>
<p>마우스 설명</p>
<form action="">
    <input type="text" name="product" value="마우스" readonly>
    <input type="number" value="1" min="1" max="10" name="quantity">
    <br>
    <button>장바구니 담기</button>
</form>
</body>
</html>
