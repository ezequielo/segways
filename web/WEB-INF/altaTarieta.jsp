
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alta tarjeta</title>
        <link rel="stylesheet" href="./css/style.css" type="text/css" />
    </head>
    <body>
        <h1>Alta tarjeta</h1>
        <html:form action="">
            <table border="1">
                <tbody>
                    <tr>
                        <td>N&umero;mero</td>
                        <td><html:text property="numero" /></td>
                    </tr>
                    <tr>
                        <td>C&oacute;digo de seguridad</td>
                        <td><html:text property="codigoSeguridad" /></td>
                    </tr>
                    <tr>
                        <td>Fecha de caducidad</td>
                        <td><html:text property="fechaCaducidad" /></td>
                    </tr>
                    <tr>
                        <td>Pin</td>
                        <td><html:text property="pin" /></td>
                    </tr>
                    <tr>
                        <td>Tipo</td>
                        <td><html:text property="tipo" /></td>
                    </tr>
                    <tr>
                        <td colspan="2"><html:submit value="Crear" /></td>
                    </tr>
                </tbody>
            </table>
        </html:form>
    </body>
</html>
