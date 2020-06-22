<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <title><s:text name="form.titulo"/></title>
        <s:head/>
    </head>
    <body>
        <h1><s:text name="form.titulo"/></h1>
        <s:form>
            <s:textfield key="form.nombre" name="persona.nombre"/>
            <s:textfield key="form.calle" name="persona.domicilio.calle"/>
            <s:textfield key="form.no.calle" name="persona.domicilio.numeroCalle"/>
            <s:textfield key="form.pais" name="persona.domicilio.pais"/>
            <s:submit key="form.enviar"/>
        </s:form>

        <h2><s:text name="form.resultados"/></h2>
        <p><s:text name="form.nombre"/>: <s:property value="persona.nombre"/></p>
        <p><s:text name="form.calle"/>: <s:property value="persona.domicilio.calle"/></p>
        <p><s:text name="form.no.calle"/>: <s:property value="persona.domicilio.numeroCalle"/></p>
        <p><s:text name="form.pais"/>: <s:property value="persona.domicilio.pais"/></p>

        <s:url var="localeES" action="personas">
            <s:param name="request_locale">es</s:param>
        </s:url>
        <s:url var="localeEN" action="personas">
            <s:param name="request_locale">en</s:param>
        </s:url>

        <p><s:a href="%{localeES}"><s:text name="form.idioma.es"/></s:a> |
            <s:a href="%{localeEN}"><s:text name="form.idioma.en"/></s:a></p>

    </body>
</html>
