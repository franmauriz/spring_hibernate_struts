<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Formulario Personas</title>
        <s:head/>
    </head>
    <body>
        <h1>Formulario de personas OGNL!</h1>
        <s:form>
            <s:textfield label="Nombre" name="persona.nombre"/>
            <s:textfield label="Calle" name="persona.domicilio.calle"/>
            <s:textfield label="Nº calle" name="persona.domicilio.numeroCalle"/>
            <s:textfield label="Pais" name="persona.domicilio.pais"/>
            <s:submit value="Enviar"/>
        </s:form>
        
        <h2>Valores Proporcionados</h2>
        <p>Nombre:<s:property value="persona.nombre"/></p>
        <p>Calle:<s:property value="persona.domicilio.calle"/></p>
        <p>Nº Calle:<s:property value="persona.domicilio.numeroCalle"/></p>
        <p>Pais:<s:property value="persona.domicilio.pais"/></p>
        
        <s:if test="persona.nombre!=null">
            <s:if test="persona.nombre=='admin'">
                <p>El usuario es administrador</p>
            </s:if>
            <s:else>
                <p>El usuario NO es administrador</p>
            </s:else>
        </s:if>
        
        
    </body>
</html>
