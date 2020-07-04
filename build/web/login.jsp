<%-- 
    Document   : login
    Created on : 03-07-2020, 12:40:39
    Author     : nacho
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="background: url(img/v.jpg)">
        <%@include file="menu.jsp" %>

        <section id="login">
            <form action="ServletLogueo" method="post">
                <center>
                <img  src="img/usuario.png" width="100" height="100"> 
                </center>
                <h2>Loguin</h2>
                <input type="hidden" name="accion" value="loguin"/>
                <input type="email" class="form-control" style="margin-bottom: 10px;" placeholder="&#128100; Correo Electronico " name="txtUsu">
                <input type="password" class="form-control" placeholder="&#128272; Password" name="txtPas">
                <input type="submit"  name="btn" value="Iniciar Sesion">

            </form>
        </section>


        <h4 align="center">
            <%
                if (request.getAttribute("msg") != null) {
                    out.println(request.getAttribute("msg"));
                }
            %>
        </h4>
    </div>
</section>
<%@include file="footer.jsp" %>


</body>
</html>
