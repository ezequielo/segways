<%-- 
    Document   : altaSucursal
    Created on : 13-jun-2013, 19:04:16
    Author     : Nacho
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
        <%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
        <%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
        <link rel="stylesheet" href="./css/style.css" type="text/css" />
        <title>Alta sucursal</title>
    </head>
    <body>
        <h1>Formulario de creación de una nueva sucursal</h1>
        <html:form action="/InsertarSucursal" >
        <table border="1">
            <tbody>
                <tr>
                    <td>Nombre</td>
                    <td><html:text property="nombre" /></td>
                </tr>
                <tr>
                    <td>Dirección</td>
                    <td><html:text property="direccion" /></td>
                </tr>
                <tr>
                    <td>Código postal</td>
                    <td><html:text property="cp" /></td>
                </tr>
                <tr>
                    <td>Localidad</td>
                    <td><html:text property="localidad" /></td>
                </tr>
                <tr>
                    <td>Provincia</td>
                    <td><html:text property="provincia" /></td>
                </tr>
                <tr>
                    <td>Código de sucursal</td>
                    <td><html:text property="codigoSucursal" /></td>
                </tr>
                <tr>
                    <td>Latitud</td>
                    <td><html:text property="latitud" /></td>
                </tr>
                <tr>
                    <td>Longitud</td>
                    <td><html:text property="longitud" /></td>
                </tr>
                <tr>
                    <td colspan="2"><html:submit value="Crear" /></td> 
                </tr>
            </tbody>
        </table>
        </html:form>
    </body>
</html>
