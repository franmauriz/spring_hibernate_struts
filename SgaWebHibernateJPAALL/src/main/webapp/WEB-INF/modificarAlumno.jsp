<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Modificar Alumno</title>
    </head>
    <body>
        <h1>Modificar Alumno</h1>
        <form method="POST" name="form1" action="${pageContext.request.contextPath}/ServletModificar">
            <input type="hidden" name="idAlumno" value="${alumno.idAlumno}"/>
            Nombre: <input type="text" name="nombre" value="${alumno.nombre}"/><br/>
            Apellido: <input type="text" name="apellido" value="${alumno.apellido}"/><br/>
            <br/>
            <h2>Datos Domicilio</h2>
            Calle:<input type="text" name="calle" value="${alumno.domicilio.calle}"/><br/>
            No. Calle:<input type="text" name="noCalle" value="${alumno.domicilio.noCalle}"/><br/>
            País:<input type="text" name="pais" value="${alumno.domicilio.pais}"/><br/>
            <br/>
            <h2>Datos de Contacto</h2>
            Email:<input type="email" name="email" value="${alumno.contacto.email}"/><br/>
            Teléfono:<input type="tel" name="telefono" value="${alumno.contacto.telefono}"/><br/>
            <br/>
            <p><input type="submit" name="Modificar" value="Modificar"/> 
                <input type="submit" name="Eliminar" value="Eliminar"/></p>
        </form>
    </body>
</html>
