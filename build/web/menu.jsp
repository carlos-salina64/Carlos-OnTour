
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Modelo.*,java.util.*" %>
<%
    String usu = "";
    String nom = "";
    HttpSession sesionOK = request.getSession();

    if (sesionOK.getAttribute("id_usuario") != null) {
        nom = (String) sesionOK.getAttribute("nombre") + " " + (String) sesionOK.getAttribute("apellidos");
    }

%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
        <link href="css/fontello.css" rel="stylesheet" type="text/css"/>
        <link href="css/estilos.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
        <link href="css/estilo.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/estilos.css">
        <link rel="stylesheet" href="css/owl.carousel.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.1/css/font-awesome.min.css">
        <link rel="stylesheet" type="text/css" href="css/flaticon.css">  
        <link href="css/estilo.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <header>
            <div class="contenedor">
                <h1><img src="img/www.png" style="width: 25px; height: 25px;">OnTour</h1>
                <input type="checkbox" id="menu-bar">
                <label class="icon-menu"  for="menu-bar"><img class="caballo" src="img/las-carreras-de-caballos.png"></label>
                <nav class="menu">
                    <a href="index.jsp">Inicio</a>
                    <%                        if (sesionOK.getAttribute("id_tipo") != null && sesionOK.getAttribute("id_tipo").equals(2)) {
                    %>
                    <a href="lista.jsp">Consultar Seguros</a>
                    <% } %>
                    <%                        if (sesionOK.getAttribute("id_tipo") != null && sesionOK.getAttribute("id_tipo").equals(1)) {
                    %>
                    <a href="agregarSeguro.jsp">Agregar Seguro</a>
                    <% } %>
                    <%
                        if (sesionOK.getAttribute(
                                "id_tipo") == null) {
                    %>

                    <a href="login.jsp">Iniciar Sesion</a>
                    <% } %>
                    <%if (sesionOK.getAttribute("id_tipo") != null) {
                    %>
                    <a class="nav-link" href="ServletLogueo?accion=cerrar">Cerrar Sesión</a>

                    <a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true"><%out.println("Bienvenido : " + nom);%></a>
                    <% }%>


                </nav>
            </div>
        </header>
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>

    </body>
</html>
