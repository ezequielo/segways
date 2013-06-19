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
        <h1>Crear Cuenta</h1>

        <html:form action="/CrearCuentaAction" onsubmit="return(validateCuentaForm(this));">
            <html:javascript formName="CuentaForm"/>
            <html:errors/>
            <logic:notEmpty name="msg">
                <bean:write name="msg" />
            </logic:notEmpty>

            <table>

                <tr><td>Entidad</td><td><html:text property="codEntidad"/></td></tr>
                <tr><td>Sucursalucursal</td><td><html:text property="codSucursal"/></td></tr>
                <tr><td>Digito de control</td><td><html:text property="digito"/></td></tr>
                <tr><td>Saldo</td><td><html:text property="saldo"/></td></tr>
                <tr><td>Tipo</td><td><html:text property="tipoCuenta"/></td></tr>
                <tr><td></td></tr>
                <tr><td colspan="2"><html:submit value="Crear"/></td></tr>
                <tr><td><br/></td></tr>
            </table>


        </html:form>

    </body>
</html:html>
