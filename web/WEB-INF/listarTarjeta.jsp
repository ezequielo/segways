<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listar tarjetas</title>
        <link rel="stylesheet" href="./css/style.css" type="text/css" />
    </head>
    <body>
        <h1>Listar tarjetas</h1>
         <table border="1">
            <thead>
                <tr>
                    <th>N&uacute;meros</th>
                    <th>C&oacute;digos de seguridad</th>
                    <th>Fechas de caducidad</th>
                    <th>Pines</th>
                    <th>Tipo</th>
                    <th>Actualizar</th>
                    <th>Eliminar</th>
                </tr>
            </thead>
            <tbody>
                <logic:notEmpty name="listar" >
                    <logic:iterate id="listar" name="listar">
                    <tr>
                        <td><bean:write name="listar" property="codigo" /></td>
                        <td><bean:write name="listar" property="numeroSeguridad" /></td>
                        <td><bean:write name="listar" property="fechaCaducidad" /></td>
                        <td><bean:write name="listar" property="pin" /></td>
                        <td><bean:write name="listar" property="tarjeta" /></td>
                        <td></td>
                        <td></td>
                    </tr>
                    </logic:iterate>
                </logic:notEmpty>   
            </tbody>
         </table>
    </body>
</html>
