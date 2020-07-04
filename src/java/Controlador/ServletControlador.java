package Controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Modelo.*;
import Conexion.Conexion;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

@WebServlet(name = "ServletControlador", urlPatterns = {"/ServletControlador"})
public class ServletControlador extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        String accion = request.getParameter("accion");
        if (accion.equals("RegistrarSeguro")) {
            this.registrarSeguro(request, response);
        } else if (accion.equals("MostrarSeguros")) {
            this.MostrarSeguros(request, response);
        }

    }

    protected void MostrarSeguros(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        ArrayList<Seguro> lista = new ArrayList<>();
        lista=SeguroDB.obtenerSeguro();
        request.setAttribute("lista", lista);
        request.getRequestDispatcher("consultarSeguro.jsp").forward(request, response);
    }

    protected void registrarSeguro(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {

        int curso = Integer.parseInt(request.getParameter("txtCurso"));
        String des = request.getParameter("txtDes");
        int pre = Integer.parseInt(request.getParameter("txtPrecio"));
        String acc = request.getParameter("txtAcci");

        Seguro s = new Seguro(curso, des, pre, acc);
        boolean rpta = SeguroDB.insertarSeguro(s);
        if (rpta) {
            response.sendRedirect("mensaje.jsp?men=Se registro el seguro correctamente");
        } else {
            response.sendRedirect("mensaje.jsp?men=No se registro el Seguro. Revisa los parametros que pusiste puede que exista un error");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(ServletControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(ServletControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
