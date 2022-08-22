<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/recursos/estilos/miestilo.css">
</head>
<body>
Hola ${param.nombrePersona}. Gracias por enviar el formulario.

<h2>Ejemplo atributo añadido usando Model</h2>
<p>${textoAMostrar}</p>

<img alt="foto" src="${pageContext.request.contextPath}/recursos/imgs/alpine-fa.png">
</body>
</html>