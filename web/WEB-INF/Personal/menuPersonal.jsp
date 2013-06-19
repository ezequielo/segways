<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="./css/stylePrueba.css" type="text/css" />
        <title>Administración</title>
    </head>
    <body>
        <h1>Menú de Administración</h1>

        <div>
            <ul>
                <li>
                    <html:form action="/PersonalPanelAction" >
                        <html:hidden property="opcion" value="clientes"/>
                        <html:image src="images/Bank_Icon_256.png" styleClass="button"  value="enviar"/>
                    </html:form>
                </li>
                <li>
                    <html:form action="/PersonalPanelAction" >
                        <html:hidden property="opcion" value="cuentas"/>
                        <html:image src="images/Bank_Icon_256.png" styleClass="button"  value="enviar"/>
                    </html:form>
                </li>
                <li>
                    <html:form action="/PersonalPanelAction" >
                        <html:hidden property="opcion" value="tarjetas"/>
                        <html:image src="images/Bank_Icon_256.png" styleClass="button"  value="enviar"/>
                    </html:form>
                </li>
                <li>
                    <html:form action="/PersonalPanelAction" >
                        <html:hidden property="opcion" value="operar"/>
                        <html:image src="images/Bank_Icon_256.png" styleClass="button"  value="enviar"/>
                    </html:form>
                </li>
                <li>
                    <html:form action="/PersonalPanelAction" >
                        <html:hidden property="opcion" value="domiciliaciones"/>
                        <html:image src="images/Bank_Icon_256.png" styleClass="button"  value="enviar"/>
                    </html:form>
                </li>
                <li>
                    <html:form action="/PersonalPanelAction" >
                        <html:hidden property="opcion" value="sucursales"/>
                        <html:image src="images/Bank_Icon_256.png" styleClass="button"  value="enviar"/>
                    </html:form>
                </li>
                <li>
                    <html:form action="/PersonalPanelAction" >
                        <html:hidden property="opcion" value="seguros"/>
                        <html:image src="images/Bank_Icon_256.png" styleClass="button"  value="enviar"/>
                    </html:form>
                </li>
                <li>
                    <html:form action="/PersonalPanelAction" >
                        <html:hidden property="opcion" value="prestamos"/>
                        <html:image src="images/Bank_Icon_256.png" styleClass="button"  value="enviar"/>
                    </html:form>
                </li>
            </ul>
        </div>
    </body>
</html>
