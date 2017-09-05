<%--@elvariable id="name" type="java"--%>
<%@ page contentType="text/html" %>
<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html lang="en">

<head>
    <title>Assignment 1</title>
</head>
<body>
    <h1>What is your name?</h1>
    <form method="POST" action="">
        <input type="text" name = "name" placeholder="Name">
        <input type="submit" value="Confirm">
    </form>
    <h2>Good Morning ${name}</h2>
</body>
</html>