<%-- 
    Document   : listarSucursal
    Created on : 17-jun-2013, 17:02:58
    Author     : Nacho
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="./css/style.css" type="text/css" />
        <title>Listar sucursal</title>
    </head>
    <body>
        <table border="1">
            <thead>
                <tr>
                    <th>Nombre</th>
                    <th>Direcci&oacute;n</th>
                    <th>C&oacute;digo postal</th>
                    <th>Localidad</th>
                    <th>Provincia</th>
                    <th>C&oacute;digo de sucursal</th>
                    <th>Latitud</th>
                    <th>Longitud</th>
                </tr>
            </thead>
            <tbody>
                <logic:notEmpty name="listar" >
                    <logic:iterate id="listar" name="listar" >
                        <tr>
                            <td><bean:write name="listar" property="nombre" /></td>
                            <td><bean:write name="listar" property="direccion" /></td>
                            <td><bean:write name="listar" property="cp" /></td>
                            <td><bean:write name="listar" property="localidad" /></td>
                            <td><bean:write name="listar" property="provincia" /></td>
                            <td><bean:write name="listar" property="codigoSucursal" /></td>
                            <td><bean:write name="listar" property="latitud" /></td>
                            <td><bean:write name="listar" property="longitud" /></td>
                            <td>
                                Actualizar
                            </td>
                            <td>
                                <html:form action="/EliminarSucursal" >
                                    <html:hidden name="listar" property="pkSucursal"></html:hidden>
                                    <html:submit value="Eliminar"></html:submit>
                                </html:form>
                            </td>
                        </tr>
                    </logic:iterate>
                </logic:notEmpty>
            </tbody>
        </table>        
    </body>
</html>