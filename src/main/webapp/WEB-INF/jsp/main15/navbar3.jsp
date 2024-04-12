<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<style>
    * {
        text-decoration: none;
        color: black;
        font-size: 30px;
        font-weight: 600;
    }

    .active {
        color: red;
    }
</style>
<div>
    <a href="/main15/sub5">

        <span class="menu-item ${current eq 'sub5' ? 'active' : ''}">sub5</span>
    </a>
    <a href="/main15/sub6">
        <span class="menu-item ${current eq 'sub6' ? 'active' : ''}">sub6</span>
    </a>
</div>

