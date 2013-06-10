<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%--<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>--%>
<%--<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>--%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>What Shall I have this meal?</title>
    </head>
    <body>
        <s:form action="login" namespace="/">
            <input type="text" name="auth.id" id="auth.id"/>
            <input type="password" name="auth.password" id="auth.password"/>
            <s:submit value="what shall we have?"/>
        </s:form>

</body>
</html>
