<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="sub12" method="get">
    <input type="text" name="title">
    <br>
    <textarea name="content">내용</textarea>
    <br>
    <select name="type" id="">
        <option value="sport">스포츠</option>
        <option value="art">예술</option>
        <option value="social">사회</option>
    </select>
    <br>
    <input type="submit">
</form>
<hr>
<form action="sub13">
    <input type="radio" name="city" value="seoul">
    서울
    <input type="radio" name="city" value="london">
    런던
    <input type="radio" name="city" value="incheon">
    인천
    <input type="submit">
</form>
<%--form>div*3>input:c[name=foods]--%>
<form action="/main20/sub14">
    <div>
        햄버거
        <input type="checkbox" name="foods" value="burger">
    </div>
    <div>
        피자
        <input type="checkbox" name="foods" value="pizza">
    </div>
    <div>
        밥
        <input type="checkbox" name="foods" value="rice">
    </div>
    <div>
        <input type="submit">
    </div>
</form>
<hr>
<form action="/main20/sub15" method="post">
    <div>
        <select name="type">
            <option value="social">사회</option>
            <option value="sport">스포츠</option>
            <option value="food">음식</option>
        </select>
    </div>
    <div>
        010-1234-4567
        <input type="radio" name="phone" value="010-1234-4567">
        <br>
        010-1111-2222
        <input type="radio" name="phone" value="010-1111-2222">
        <br>
        010-3333-4444
        <input type="radio" name="phone" value="010-3333-4444">
    </div>
    <br>
    <div>
        <input type="checkbox" name="book" value="book1">
        책 1번
        <input type="checkbox" name="book" value="book2">
        책 2번
        <input type="checkbox" name="book" value="book3">
        책 3번
    </div>
    <div>
        <input type="submit">
    </div>
</form>
</body>
</html>
