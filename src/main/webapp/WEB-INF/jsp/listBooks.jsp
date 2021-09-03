<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <style>
        table {
            display: table;
            border-collapse: separate;
            box-sizing: border-box;
            text-indent: initial;
            border-spacing: 2px;
            border-color: grey;
        }

        td, th {
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }
    </style>
    <title>Books</title>
</head>
<body>
<a href="/book/">Books</a> <br/><br/>
<a href="create">+ dodaj Book</a><br/>
<table>
    <tr>
        <th>ISBN</th>
        <th>Title</th>
        <th>Author</th>
        <th>Publisher</th>
        <th>Type</th>
        <th>Action</th>
    </tr>
    <c:forEach items="${books}" var="b">
        <tr>
            <td>${b.isbn}</td>
            <td>${b.title}</td>
            <td>${b.author}</td>
            <td>${b.publisher}</td>
            <td>${b.type}</td>
            <td><a href="create?id=${b.id}">edit</a></td>
            <td><a href="delete/${b.id}">delete</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>