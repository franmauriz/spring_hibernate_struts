<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Agregar Alumno</title>
    </head>
    <body>
        <h1>Agregar Alumno</h1>
        <form method="POST" name="form1" action="${pageContext.request.contextPath}/ServletAgregar">
            Nombre: <input type="text" name="nombre"/><br/>
            Apellido: <input type="text" name="apellido"/><br/>
            <br/>
            <h2>Datos Domicilio</h2>
            Calle:<input type="text" name="calle"/><br/>
            No. Calle:<input type="text" name="noCalle"/><br/>
            País:<input type="text" name="pais"/><br/>
            <br/>
            <h2>Datos de Contacto</h2>
            Email:<input type="email" name="email"/><br/>
            Teléfono:<input type="tel" name="telefono"/><br/>
            <br/>
            <input type="submit" name="Agregar" value="Agregar"/>
        </form>
    </body>
</html>
