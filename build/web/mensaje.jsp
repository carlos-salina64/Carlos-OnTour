
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mensaje</title>

    </head>
    <body>
        <%@include file="menu.jsp" %>


        <div align="center" style="margin-top: 100px;" >


            <img  src="img/caliz.png" width="100" height="100"> 
        </div>


        <h2 class="" align="center">
            <%
                if (request.getParameter("men") != null) {
                    out.println(request.getParameter("men"));
                }
            %>
        </h2>
        <div class="container">
            <h3 align="center">
                <a class="btn btn-primary btn-sm btn-block"  href="index.jsp">
                    <i class="flaticon-next"></i>Volver a Principal</a>
            </h3>
        </div>
        <%@include file="footer.jsp" %>


    </body>
</html>

