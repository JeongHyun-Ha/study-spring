<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<body>
<c:import url="/WEB-INF/fragment/navbar5.jsp">
    <c:param name="current" value="cart"/>
</c:import>
<div>
    <br>
    <h2>장바구니</h2>
</div>
<c:if test="${empty sessionScope.cart}" var="emptyCart">
    장바구니가 비어있습니다.
</c:if>
<c:if test="${not emptyCart}">
    <table>
        <thead>
        <tr>
            <th>상품명</th>
            <th>갯수</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${sessionScope.cart}" var="item">
            <tr>
                <td>${item.key}</td>
                <td>${item.value}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</c:if>
</body>
<head>
    <title>장바구니</title>
</head>
</html>
