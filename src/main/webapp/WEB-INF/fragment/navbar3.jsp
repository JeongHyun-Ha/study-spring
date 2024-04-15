<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<style>
    * {
        text-decoration: none;
    }

    .active {
        background-color: yellow;
    }
</style>
<div style="display: flex; justify-content: space-between">
    <div>
        <a class="${param.current eq 'sub3' ? 'active' : ''}" href="/main17/sub3">sub3</a>
        <a class="${param.current eq 'sub4' ? 'active' : ''}" href="/main17/sub4">sub4</a>
        <a class="${param.current eq 'sub5' ? 'active' : ''}" href="/main17/sub5">sub5</a>

    </div>
    <div>
        <c:if test="${not empty sessionScope.username}" var="loggedIn">
            <span>guest : ${sessionScope.username}님</span>
            <a class="${param.current eq 'sub9' ? 'active' : ''}" href="/main17/sub9">로그아웃</a>
        </c:if>
        <c:if test="${empty loggedIn}">
            아이디 없음
        </c:if>
    </div>
</div>