<%-- 
    Document   : gestionSucursal
    Created on : 13-jun-2013, 18:23:27
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
        <link rel="stylesheet" href="./css/style.css" type="text/css" />
        <title>Gestión de Sucursales</title>
    </head>
    <body>
        <h1>Gestión de Sucursales</h1>
        <ul>
            <li><html:link action="/ListarSucursal">Listar todas las sucursales</html:link></li>
            <li><html:link action="/AltaSucursal">Dar de alta una sucursal</html:link></li>
        </ul>
    </body>
</html>
