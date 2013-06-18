<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:html lang="true">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="./css/style.css" type="text/css" />
        <title><bean:message key="welcome.title"/></title>
        <html:base/>
    </head>
    <body>
        <h1>LOGIN</h1>
        <div id="login" class="login" >
            <html:form action="/LoginAction" onsubmit="return(validateLoginForm(this));">

                <html:errors/>
                <html:javascript formName="LoginForm"/>
                <table>

                    <tr><td><label>Username:</label></td><td><html:text property="usuario"/></td></tr>
                    <tr><td><label>Password:</label></td><td><html:password property="password"/></td></tr>
                    <tr><td></td></tr>
                    <tr><td colspan="2"><html:submit value="Login" styleClass="default"/></td></tr>
                    <tr><td><br/></td></tr>
                    <tr><td colspan="2">¿No eres cliente?, <a class="link" href="registro.jsp">Regístrate</a></td></tr>
                </table>
                <logic:notEmpty name="msg">
                    <bean:write name="msg" />
                </logic:notEmpty>
            </html:form>
        </div>
        <div id="loginFoto" class="loginFoto">
            FOTO
        </div>
    </body>
</html:html>
