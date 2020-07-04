
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consultar Seguros</title>
    </head>
    <body>
        <%@include file="menu.jsp" %>
        <%
            Connection cn = null;
            String user = "carlossalina";
            String pass = "carlos123";
            String url = "jdbc:oracle:thin:@localhost:1521:xe";

            Class.forName("oracle.jdbc.OracleDriver");
            cn = DriverManager.getConnection(url, user, pass);

            PreparedStatement ps;
            ResultSet rs;
            ps = cn.prepareStatement("select * from seguro s INNER JOIN apoderado a on a.id_curso=s.id_curso WHERE a.id_curso=s.id_curso");
            rs = ps.executeQuery();
        %>

        <section id="banner">
            <img src="img/horsejpg.jpg">
            <div class="contenedor">
                <h2 style="color: white;">Seguros de Viaje Asignados a tu curso</h2>
                <p style="color: wheat;">Observa la informació de los seguros de tu viaje</p>
            </div>
        </section>
        <div class="container">

            <div class="table-responsive">
                <table  class="table table-bordered table-hover table-condensed" border="1" align="center">
                    <tr>
                        <th class="info">Codigo del Seguro</th>
                        <th class="success">Cobertura del Seguro</th>
                        <th class="success">Precio a Pagar por curso</th>
                        <th class="success">Cobertura de Accidente</th>

                    </tr>
                    <%
                        while (rs.next()) {


                    %>
                    <tr>
                        <td><p>Nro: <%=rs.getInt("id_seguro")%></p></td>
                        <td><p><%=rs.getString("descripcion")%></p></td>
                        <td><p>$<%=rs.getInt("precio")%></p></td>
                        <td><p><%=rs.getString("accidente")%></p></td>
                    </tr>
                    <% }%>
                </table>
            </div>
                <a class="btn btn-primary btn-sm btn-block" style="margin-bottom: 200px;"  href="index.jsp">
                <i class="flaticon-next"></i>Volver a Principal</a>
        </div>

        <section id="info">
            <h3>Excelentes ofertas de viaje al mejor precio</h3>
            <div class="contenedor">
                <div class="info-pet">
                    <img src="img/chiloe.jpg">
                    <h6>Nada como el Sur, Chiloe</h6>
                </div>
                <div class="info-pet">
                    <img src="img/juan.jpg">
                    <h6>¿Recuerdas a Felipito?, Juan Fernandez</h6>
                </div>
                <div class="info-pet">
                    <img src="img/pascua.jpg">
                    <h6>Belleza absoluta, Isla de Pascua</h6>
                </div>
            </div>
        </section>

        <%@include file="footer.jsp" %>
    </body>
</html>
