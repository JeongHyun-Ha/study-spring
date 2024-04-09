<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>Expression Language</p>
<p>간단한 연산 사용 가능</p>
<p>산술 연산, 논리 연산, 비교 연산, 삼항 연산</p>

<h3>산술연산(+, -, *, /, %)</h3>
<p>${5+3}</p>
<p>${10-5}</p>
<p>${8*3}</p>
<p>${6/2}</p>
<%--3.5--%>
<p>${7/2}</p>
<p>${7 div 2}</p>
<p>${7 % 2}</p>
<%--3--%>
<p>${15 mod 4}</p>
<%-- 문자열 사용 가능 --%>
<%-- 7 --%>
<p>${"3" + "4"}</p>
<%--<p>${"three" + "four"}</p>--%>
<p>${num1} + ${num2} = ${num1 + num2}</p>
<h3>비교 연산(>, <, >=, <=, ==)</h3>
<p>5 > 3 :${5 > 3}</p>
<p>5 < 3 : ${5 < 3}</p>
<p>5 == 3 : ${5 == 3}</p>
<p>5 gt 3 : ${5 gt 3}</p>
<p>5 lt 3 : ${5 lt 3}</p>
<p>5 ge 3 : ${5 ge 3}</p>
<p>5 le 3 : ${5 le 3}</p>
<p>5 eq 3 : ${5 eq 3}</p>
<p>hello < spring : ${"hello"<"spring"}</p>
<p>hello < Spring : ${"hello"<"Spring"}</p>
<p>"11" < "2" : ${"11"<"2"}</p>
<p>11 < 2 : ${11 < 2}</p>
<p>11 < "2" : ${11 < "2"} (수와 수가 아닌 것으로 연산하면 수로 바뀜)</p>
<h3>논리연산(&&, ||)</h3>
<p>true && true : ${true && true}</p>
<p>true && false : ${true && false}</p>
<p>false && true : ${false && true}</p>
<p>false && false : ${false && false}</p>
<p>true || true : ${true || true}</p>
<p>false || true : ${false || true}</p>
<p>true || false : ${true || false}</p>
<p>false || false : ${false || false}</p>
<p>true and true : ${true and true}</p>
<p>true or false : ${true or false}</p>
<h3>삼항연산자</h3>
<p>true ? "hello" : "world" > ${true ? "hello" : "world"}</p>
<p>false ? "hello" : "world" > ${false ? "hello" : "world"}</p>
<p>${age1 ge 20 ? "투표 가능" : "투표 불가능"}</p>
<p>${age2 ge 20 ? "투표 가능" : "투표 불가능"}</p>
<p>quantity * price : ${quantity*price}</p>
</body>
</html>
