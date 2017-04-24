<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <link href="<c:url value="/resource/css/Reg.css" />" rel="stylesheet">
    <style>
        .error{
            color: red;
            font-family: san-sarif;
        }
    </style>
    <title>SignIn</title>

</head
><body
>
<div class="login-page">
    <div class="form">
        <form:form method="POST" cssclass="login-form"  modelAttribute="signIn" action="/signIn">
            <form:errors  path="login" cssClass="error"/>
            <form:input path="login" id="login" placeholder="username"/>
            <form:errors  path="password" cssClass="error"/>
            <form:input path="password" id="password"  type="password" placeholder="password"/>
            <form:button type="sumbit">login</form:button>
            <p class="message">Not registered? <a href="/registration">Create an account</a></p>
        </form:form>

    </div>
</div>
</body>
</html>
