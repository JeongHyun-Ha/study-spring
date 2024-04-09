<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>empty 연산자</h3>
<p>길이가 0인 Collection, String, 존재하지 않는 Attribute, null 일 때 true</p>
<p>List.of(3) : ${empty attr1}</p>
<p>List.of() : ${empty attr2}</p>
<p>Map.of("a", "b") : ${empty attr3}</p>
<p>Map.of() : ${empty attr4}</p>
<p>empty "" : ${empty ""}</p>
<p>empty attr0 : ${empty attr0}</p>
<p>null : ${empty attr5}</p>
<p>empty 0 : ${empty 0}</p>
</body>
</html>
