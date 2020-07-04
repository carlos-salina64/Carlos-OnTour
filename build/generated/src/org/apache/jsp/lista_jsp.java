package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;
import Modelo.*;
import java.util.*;

public final class lista_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/menu.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Consultar Seguros</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    String usu = "";
    String nom = "";
    HttpSession sesionOK = request.getSession();

    if (sesionOK.getAttribute("id_usuario") != null) {
        nom = (String) sesionOK.getAttribute("nombre") + " " + (String) sesionOK.getAttribute("apellidos");
    }


      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title></title>\n");
      out.write("        <link href=\"css/fontello.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/estilos.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\" integrity=\"sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"css/estilo.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/estilos.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/owl.carousel.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.6.1/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/flaticon.css\">  \n");
      out.write("        <link href=\"css/estilo.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <div class=\"contenedor\">\n");
      out.write("                <h1><img src=\"img/www.png\" style=\"width: 25px; height: 25px;\">OnTour</h1>\n");
      out.write("                <input type=\"checkbox\" id=\"menu-bar\">\n");
      out.write("                <label class=\"icon-menu\"  for=\"menu-bar\"><img class=\"caballo\" src=\"img/las-carreras-de-caballos.png\"></label>\n");
      out.write("                <nav class=\"menu\">\n");
      out.write("                    <a href=\"index.jsp\">Inicio</a>\n");
      out.write("                    ");
                        if (sesionOK.getAttribute("id_tipo") != null && sesionOK.getAttribute("id_tipo").equals(2)) {
                    
      out.write("\n");
      out.write("                    <a href=\"lista.jsp\">Consultar Seguros</a>\n");
      out.write("                    ");
 } 
      out.write("\n");
      out.write("                    ");
                        if (sesionOK.getAttribute("id_tipo") != null && sesionOK.getAttribute("id_tipo").equals(1)) {
                    
      out.write("\n");
      out.write("                    <a href=\"agregarSeguro.jsp\">Agregar Seguro</a>\n");
      out.write("                    ");
 } 
      out.write("\n");
      out.write("                    ");

                        if (sesionOK.getAttribute(
                                "id_tipo") == null) {
                    
      out.write("\n");
      out.write("\n");
      out.write("                    <a href=\"login.jsp\">Iniciar Sesion</a>\n");
      out.write("                    ");
 } 
      out.write("\n");
      out.write("                    ");
if (sesionOK.getAttribute("id_tipo") != null) {
                    
      out.write("\n");
      out.write("                    <a class=\"nav-link\" href=\"ServletLogueo?accion=cerrar\">Cerrar Sesión</a>\n");
      out.write("\n");
      out.write("                    <a class=\"nav-link disabled\" href=\"#\" tabindex=\"-1\" aria-disabled=\"true\">");
out.println("Bienvenido : " + nom);
      out.write("</a>\n");
      out.write("                    ");
 }
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\" integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js\" integrity=\"sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        ");

            Connection cn = null;
            String user = "carlossalinas";
            String pass = "carlos123";
            String url = "jdbc:oracle:thin:@localhost:1521:xe";

            Class.forName("oracle.jdbc.OracleDriver");
            cn = DriverManager.getConnection(url, user, pass);

            PreparedStatement ps;
            ResultSet rs;
            ps = cn.prepareStatement("select * from seguro s INNER JOIN apoderado a on a.id_curso=s.id_curso WHERE a.id_curso=s.id_curso");
            rs = ps.executeQuery();
        
      out.write("\n");
      out.write("\n");
      out.write("        <section id=\"banner\">\n");
      out.write("            <img src=\"img/horsejpg.jpg\">\n");
      out.write("            <div class=\"contenedor\">\n");
      out.write("                <h2 style=\"color: white;\">Seguros de Viaje Asignados a tu curso</h2>\n");
      out.write("                <p style=\"color: wheat;\">Observa la informació de los seguros de tu viaje</p>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("            <div class=\"table-responsive\">\n");
      out.write("                <table  class=\"table table-bordered table-hover table-condensed\" border=\"1\" align=\"center\">\n");
      out.write("                    <tr>\n");
      out.write("                        <th class=\"info\">Codigo del Seguro</th>\n");
      out.write("                        <th class=\"success\">Cobertura del Seguro</th>\n");
      out.write("                        <th class=\"success\">Precio a Pagar por curso</th>\n");
      out.write("                        <th class=\"success\">Cobertura de Accidente</th>\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                    ");

                        while (rs.next()) {


                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td><p>Nro: ");
      out.print(rs.getInt("id_seguro"));
      out.write("</p></td>\n");
      out.write("                        <td><p>");
      out.print(rs.getString("descripcion"));
      out.write("</p></td>\n");
      out.write("                        <td><p>$");
      out.print(rs.getInt("precio"));
      out.write("</p></td>\n");
      out.write("                        <td><p>");
      out.print(rs.getString("accidente"));
      out.write("</p></td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
 }
      out.write("\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("                <a class=\"btn btn-primary btn-sm btn-block\" style=\"margin-bottom: 200px;\"  href=\"index.jsp\">\n");
      out.write("                <i class=\"flaticon-next\"></i>Volver a Principal</a>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <section id=\"info\">\n");
      out.write("            <h3>Excelentes ofertas de viaje al mejor precio</h3>\n");
      out.write("            <div class=\"contenedor\">\n");
      out.write("                <div class=\"info-pet\">\n");
      out.write("                    <img src=\"img/chiloe.jpg\">\n");
      out.write("                    <h6>Nada como el Sur, Chiloe</h6>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"info-pet\">\n");
      out.write("                    <img src=\"img/juan.jpg\">\n");
      out.write("                    <h6>¿Recuerdas a Felipito?, Juan Fernandez</h6>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"info-pet\">\n");
      out.write("                    <img src=\"img/pascua.jpg\">\n");
      out.write("                    <h6>Belleza absoluta, Isla de Pascua</h6>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <footer style=\"margin-top: 200px;\">\n");
      out.write("            <div class=\"contenedor\">\n");
      out.write("                <p class=\"copy\">OnTour &copy; 2020 </p>\n");
      out.write("                <div class=\"sociales\">\n");
      out.write("                    <a href=\"https://mehueleelpitoacanela.es/post/150136118700/no-entiendo-una-mierda-mejor-aprendo-a-robar\"><img src=\"img/facebook.png\"></a>\n");
      out.write("                    <a href=\"https://es.memedroid.com/memes/detail/2754424/Un-poco-de-humor-negro-no-hace-dano-de-vez-en-cuando\"><img src=\"img/instagram.png\"></a>\n");
      out.write("                    <a href=\"https://www.youtube.com/watch?v=okDkyxFI9BQ\"><img src=\"img/youtube.png\"></a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
