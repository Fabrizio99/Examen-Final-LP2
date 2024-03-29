/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.bean.especialidad;
import modelo.dao.alumnosDAO;
import modelo.dao.especialidadDAO;

/**
 *
 * @author lab01
 */
@WebServlet(urlPatterns = {"/alumnosServlet","/alumnos","/grabarEspecialidad","/foto","/vistaAlumnos"})
public class alumnosServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        if(request.getServletPath().equals("/alumnos")){
            int idEspecialidad = Integer.parseInt(request.getParameter("id"));
            request.setAttribute("cantidadAlumnos", alumnosDAO.cantidadAlumnosEspecialidad(idEspecialidad));
            request.setAttribute("especialidad", especialidadDAO.buscar(idEspecialidad));
            request.setAttribute("alumnos", alumnosDAO.alumnosEspecialidadIndice(idEspecialidad, 1, 3));
            request.getRequestDispatcher("inicio.jsp").forward(request, response);
        }
        if(request.getServletPath().equals("/grabarEspecialidad")){
            String nombre = request.getParameter("nombre");
            especialidad esp = new especialidad();
            esp.setNom_esp(nombre);
            especialidadDAO.insertar(esp);
            request.getRequestDispatcher("inicio.jsp").forward(request, response);
        }
        if(request.getServletPath().equals("/foto")){
            int idAlumno = Integer.parseInt(request.getParameter("idAlumno"));
            request.setAttribute("alumno", alumnosDAO.buscar(idAlumno));
            request.getRequestDispatcher("WEB-INF/verfoto.jsp").forward(request, response);
        }
        if(request.getServletPath().equals("/vistaAlumnos")){
            int idEspecialidad = Integer.parseInt(request.getParameter("idEspecialidad"));
            int indice = Integer.parseInt(request.getParameter("indice"));
            request.setAttribute("cantidadAlumnos", alumnosDAO.cantidadAlumnosEspecialidad(idEspecialidad));
            request.setAttribute("vistaalumnos", alumnosDAO.alumnosEspecialidadIndice(idEspecialidad, indice, 3));
            request.setAttribute("especialidad", especialidadDAO.buscar(idEspecialidad));
            request.getRequestDispatcher("inicio.jsp").forward(request, response);
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
