<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
        .error {
            color: red;
        }
    </style>
    <title>Create book</title>
</head>
<body>
<table>
    <form:form method="post" modelAttribute="book">
        <tr>
            <td><form:label path="isbn">ISBN:</form:label></td>
            <td><form:input path="isbn"/></td>
            <td><form:errors path="isbn" cssClass="error" element="div" /></td>
        </tr>
        <tr>
            <td><form:label path="title">Title:</form:label></td>
            <td><form:input path="title"/></td>
            <td><form:errors path="title" cssClass="error" element="div" /></td>
        </tr>
        <tr>
            <td><form:label path="author">Author:</form:label></td>
            <td><form:input path="author"/></td>
            <td><form:errors path="author" cssClass="error" element="div" /></td>
        </tr>
        <tr>
            <td><form:label path="publisher">Publisher:</form:label></td>
            <td><form:input path="publisher"/></td>
            <td><form:errors path="publisher" cssClass="error" element="div" /></td>
        </tr>
        <tr>
            <td><form:label path="type">Type:</form:label></td>
            <td><form:input path="type"/></td>
            <td><form:errors path="type" cssClass="error" element="div" /></td>
        </tr>
        <tr>
            <td><input type="submit" value="Save"></td>
        </tr>
    </form:form>
</table>
</body>
</html>