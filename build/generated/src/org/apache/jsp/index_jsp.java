package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" charset=UTF-8\">\n");
      out.write("        <title>OnTour</title>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    ");
      out.write("\n");
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
      out.write("                    <a href=\"agregarSeguro.jsp\">Agregar Seguro</a>\n");
      out.write("                    <a href=\"\">Iniciar Sesion</a>\n");
      out.write("                    <a href=\"\">Cerrar Sesion</a>\n");
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
      out.write("\n");
      out.write("        <main>\n");
      out.write("            <section id=\"banner\">\n");
      out.write("                <img src=\"img/banner.jpg\">\n");
      out.write("                <div class=\"contenedor\">\n");
      out.write("                    <h2>Sitio Web para viajes Escolares</h2>\n");
      out.write("                    <p>¿Cual es el mejor viaje para su curso?</p>\n");
      out.write("                    <a href=\"\">Ir a servicio</a>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("\n");
      out.write("            <section id=\"Bienvenidos\">\n");
      out.write("                <h2>BIENVENIDOS A NUESTRO SISTEMA</h2>\n");
      out.write("                <p>Estamos felices de mostrarte nuestro nuevo sitio web para que puedas\n");
      out.write("                    observar la información de los viajes programados para tu curso</p>\n");
      out.write("            </section>\n");
      out.write("\n");
      out.write("            <section id=\"blog\">\n");
      out.write("                <h3>Lo ultimo de nuestro Blog</h3>\n");
      out.write("                <div class=\"contenedor\">\n");
      out.write("                    <article>\n");
      out.write("                        <img src=\"img/rel.jpg\">\n");
      out.write("                        <p>Conoce nuestros ultimos paquetes de viaje</p>\n");
      out.write("                    </article>\n");
      out.write("                    <article>\n");
      out.write("                        <img src=\"img/viaje.jpg\">\n");
      out.write("                        <p>Vive experiencias inolvidables con tus compañeros</p>\n");
      out.write("                    </article>\n");
      out.write("                    <article>\n");
      out.write("                        <img src=\"img/chopus.jpg\">\n");
      out.write("                        <h4>Meet the Chopus</h4>\n");
      out.write("                    </article>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("\n");
      out.write("            <section id=\"info\">\n");
      out.write("                <h3>Excelentes ofertas de viaje al mejor precio</h3>\n");
      out.write("                <div class=\"contenedor\">\n");
      out.write("                    <div class=\"info-pet\">\n");
      out.write("                        <img src=\"img/chiloe.jpg\">\n");
      out.write("                        <h6>Nada como el Sur, Chiloe</h6>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"info-pet\">\n");
      out.write("                        <img src=\"img/juan.jpg\">\n");
      out.write("                        <h6>¿Recuerdas a Felipito?, Juan Fernandez</h6>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"info-pet\">\n");
      out.write("                        <img src=\"img/pascua.jpg\">\n");
      out.write("                        <h6>Belleza absoluta, Isla de Pascua</h6>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("        </main>\n");
      out.write("        \n");
      out.write("    ");
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
