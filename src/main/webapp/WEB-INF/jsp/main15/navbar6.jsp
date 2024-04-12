<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<style>
    * {
        text-decoration: none;

        font-size: 30px;
        font-weight: 600;
    }

    .act {
        color: red;
    }
</style>
<div>
    <a class="${param.current eq 'sub10' ? 'act' : ''}" href="/main15/sub10">
        <span class="menu-item">sub10</span>
    </a>
    <a class="${param.current eq 'sub11' ? 'act' : ''}" href="/main15/sub11">
        <span class="menu-item">sub11</span>
    </a>
    <div>
        ${param.cur}
    </div>
</div>