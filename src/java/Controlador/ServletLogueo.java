package Controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;
import Conexion.Conexion;
import javax.servlet.http.HttpSession;
import oracle.jdbc.OracleTypes;

@WebServlet(name = "ServletLogueo", urlPatterns = {"/ServletLogueo"})
public class ServletLogueo extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("accion");
        if (accion.equals("loguin")) {
            String usu = request.getParameter("txtUsu");
            String pas = request.getParameter("txtPas");
            try {
                CallableStatement cl = Conexion.obtenerConexion().prepareCall("{call sp_loguin(?,?,?)}");
                cl.registerOutParameter(1, OracleTypes.CURSOR);
                cl.setString(2, usu);
                cl.setString(3, pas);
                cl.execute();
                ResultSet rs = (ResultSet) cl.getObject(1);
                if (rs.next()) {
                    HttpSession sesionOK = request.getSession();
                    sesionOK.setAttribute("id_usuario", (int) rs.getInt(1));
                    sesionOK.setAttribute("nombre", (String) rs.getString(2));
                    sesionOK.setAttribute("apellidos", (String) rs.getString(3));
                    sesionOK.setAttribute("id_tipo", (int) rs.getInt(7));
                    request.getRequestDispatcher("index.jsp").forward(request, response);
                } else {
                    request.setAttribute("msg", "Error de Usuario o Contraseña");
                    request.getRequestDispatcher("login.jsp").forward(request, response);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        } else if (accion.equals("cerrar")) {
            HttpSession sesionOK = request.getSession();
            request.getSession().removeAttribute("id_usuario");
            request.getSession().removeAttribute("nombre");
            request.getSession().removeAttribute("apellidos");
            request.getSession().removeAttribute("id_tipo");
            sesionOK.invalidate();
            request.getRequestDispatcher("index.jsp").forward(request, response);
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
        processRequest(request, response);
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
        processRequest(request, response);
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
