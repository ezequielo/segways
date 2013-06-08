<%-- 
    Document   : registro
    Created on : 04-jun-2013, 19:05:04
    Author     : Carlos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Crear cuenta</title>
    </head>
    <body>
        <h1>Crear cuenta</h1>
        <html:form action="/Registro">
            <table>
                <tr><td><html:errors></html:errors></td></tr>
                <tr><td><label>Nombre</label></td></tr><tr><td><html:text property="nombre"/></td></tr>
                <tr><td><label>Apellidos</label></td></tr><tr><td><html:text property="apellido_1"/><html:text property="apellido_2"/></td></tr>
                <tr><td><label>E-mail</label></td></tr><tr><td><html:text property="email"/></td></tr>
                <tr><td><label>Identidad</label></td></tr><tr><td><html:text property="identidad"/></td></tr>
                <tr><td><label>Dirección</label></td></tr><tr><td><html:text property="direccion"/></td></tr>
                <tr><td><label>Localidad</label></td></tr><tr><td><html:text property="localidad"/></td></tr>
                <tr><td><label>Provincia</label></td></tr><tr><td><html:text property="provincia"/></td></tr>
                <tr><td><label>C.P.</label></td></tr><tr><td><html:text property="cp"/></td></tr>
                <tr><td><label>Teléfono</label></td></tr><tr><td><html:text property="telefono"/></td></tr>
                <tr><td><label>País</label></td></tr><tr><td><html:text property="pais"/></td></tr>
                <tr><td colspan="2"><html:submit value="Crear"/></td></tr>
            </table>
        </html:form>
    </body>
</html>
