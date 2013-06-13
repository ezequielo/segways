<%-- 
    Document   : menuPersonal
    Created on : 13-jun-2013, 18:14:13
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
        <title>Administración</title>
    </head>
    <body>
        <h1>Menú de Administración</h1>
        <ul>
            <li><html:link action="/GestionSucursal">Gestión de Sucursales</html:link></li>
        </ul>
    </body>
</html>
