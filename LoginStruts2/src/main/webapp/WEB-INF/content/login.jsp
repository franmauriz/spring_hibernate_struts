<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><s:property value="titulo"/></title>
    </head>
    <body>
        <h1><s:property value="titulo"/></h1>
        <s:form>
            <s:textfield key="form.usuario" name="nombre"/>
            <s:password key="form.password" name="password"/>
            <s:submit key="form.boton" name="submit"/>
        </s:form>
        <div>
            <p><s:property value="valores"/></p>
            <p><s:property value="usuario"/>: <s:property value="nombre"/></p>
            <p><s:property value="password"/>: <s:property value="passWord"/></p>
        </div>
    </body>
</html>
