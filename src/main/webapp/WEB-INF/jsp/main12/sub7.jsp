<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
    <style>
        table {
            border: 0px solid black;
            width: 600px;
        }

        th {
            border-bottom: 1px solid black;
            border-collapse: collapse;
            padding: 5px;
        }

        td {
            border-bottom: 1px solid gray;
            text-align: center;
            padding: 2px;
        }
    </style>
</head>
<body>
<h3>선수 목록</h3>
<table>
    <thead>
    <tr>
        <th>No.</th>
        <th>이름</th>
        <th>팀</th>
        <th>국적</th>
        <th>종목</th>
        <th>포지션</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${playerList}" var="element" varStatus="status">
        <tr>
            <td>${status.count}</td>
            <td>${element.team}</td>
            <td>${element.name}</td>
            <td>${element.country}</td>
            <td>${element.event}</td>
            <td>
                <c:forEach items="${element.positions}" var="position" varStatus="st">
                    ${position}
                    <c:if test="${not st.last}">
                        ,
                    </c:if>
                </c:forEach>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
