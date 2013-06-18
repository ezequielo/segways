<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gestión de Tarjetas</title>
        <link rel="stylesheet" href="./css/style.css" type="text/css" />
    </head>
    <body>
        <h1>Gestión de Tarjetas</h1>
        <ul>
            <li><html:link action="/ListarTarjeta" >Listar tarjetas del cliente</html:link></li>
            <li><html:link action="/AltaTarjeta" >Dar de alta una tarjeta del cliente</html:link></li>
        </ul>
    </body>
</html>