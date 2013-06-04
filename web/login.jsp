<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:html lang="true">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><bean:message key="welcome.title"/></title>
        <html:base/>
    </head>
    <body>
        <h1>LOGIN</h1>
        <html:form action="/Login">
            <table>
                <tr><td colspan="2"><bean:write name="LoginForm" property="message" /></td></tr>
                <tr><td><label>Username:</label></td><td><html:text property="usuario"/></td></tr>
                <tr><td><label>Password:</label></td><td><html:password property="password"/></td></tr>
                <tr><td colspan="2"><html:submit value="Login"/></td></tr>
            </table>
        </html:form>
    </body>
</html:html>
