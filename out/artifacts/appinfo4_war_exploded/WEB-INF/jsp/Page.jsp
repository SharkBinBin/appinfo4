<%--
  Created by IntelliJ IDEA.
  User: Hyy
  Date: 2018/11/8
  Time: 14:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>hello</h1>
<table>
    <c:forEach items="${AppList}" var="ll">
    <Tr>
        <Td>
            ${ll.softwareName}
        </Td>

    </Tr>
    </c:forEach>
    <Td>
        <Tr>
            上一页
    <c:forEach begin="1" end="${TotalPageSize}" var="ll">

        <a href="Page?PageNum=${PageNum}&PageSize=${PageSize}">第${ll}页&nbsp</a>


    </c:forEach>
            下一页
        </Tr>
</table>


</body>
</html>
