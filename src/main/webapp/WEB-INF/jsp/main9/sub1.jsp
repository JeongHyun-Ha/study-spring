<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>${person.name}</h1>
<h1>${person.age}</h1>
<hr>
<h1>${person["name"]}</h1>
<h1>${person["age"]}</h1>
</body>
</html>
