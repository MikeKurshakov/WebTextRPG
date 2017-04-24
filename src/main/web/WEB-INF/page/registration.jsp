<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <link href="<c:url value="/resource/css/Reg.css" />" rel="stylesheet">
    <style>
        .error{
            color: red;
        }
    </style>
    <title>Authorization</title>

</head>
<body>
<%
    List<String> categories = new ArrayList<>();
    categories.add("Warrior");
    categories.add("Mage");
    categories.add("Rogue");
    request.getSession().setAttribute("categories",categories);
%>
<div class="login-page">
    <div class="form">
        <form:form method="POST" cssclass="register-form"   modelAttribute="registration" action="/registration">
            <form:errors  path="login" cssClass="error"/>
            <form:input path="login" id="login" placeholder="username"/>
            <form:errors  path="email" cssClass="error"/>
            <form:input path="email" id="email" placeholder="email"/>
            <form:errors  path="password" type="password" cssClass="error"/>
            <form:input path="password" id="password" placeholder="password"/>

            <label for="className">Class: </label>
            <form:select id="className" path="className">
            <form:options items="${categories}" />
            </form:select>
            <form:button >login</form:button>
            <p class="message">Already registered? <a href="/">Sign In</a></p>
        </form:form>

    </div>
</div>
</body>
</html>
