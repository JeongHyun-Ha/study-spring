<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<style>
    * {
        text-decoration: none;
    }

    a {
        border: 1px solid black;
        width: 100px;
        height: 60px;
    }

    .active {
        background: yellow;
    }
</style>
<div>
    <a class="${param.current eq sub6 ? 'active' : ''}" href="/main17/sub6">sub6</a>
    <a class="${param.current eq sub7 ? 'active' : ''}" href="/main17/sub7">sub7</a>
    <a class="${param.current eq sub8 ? 'active' : ''}" href="/main17/sub8">sub8</a>
</div>
<div>
    <p>${sessionScope.id}</p>
</div>

