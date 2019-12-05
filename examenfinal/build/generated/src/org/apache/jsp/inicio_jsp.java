package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.dao.alumnosDAO;
import modelo.bean.alumno;
import java.util.ArrayList;
import modelo.bean.especialidad;
import modelo.dao.especialidadDAO;

public final class inicio_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            table{\n");
      out.write("                border-collapse: collapse;\n");
      out.write("            }\n");
      out.write("            td{\n");
      out.write("                padding:10px;\n");
      out.write("            }\n");
      out.write("            td{\n");
      out.write("              border: 1px solid black;  \n");
      out.write("            }\n");
      out.write("            .tabla td{\n");
      out.write("                border: none;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            ArrayList<especialidad> lista = especialidadDAO.listar();
            especialidad esp = (especialidad) request.getAttribute("especialidad");
            ArrayList<alumno> alumnos = (ArrayList<alumno>) request.getAttribute("alumnos");
            ArrayList<alumno> alumnosIndice = (ArrayList<alumno>) request.getAttribute("vistaalumnos");
        
      out.write("\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <td><a href=\"nuevaEspecialidad\">Nueva Especialidad</a></td>\n");
      out.write("                <td>\n");
      out.write("                    ");
if(esp == null){
      out.write("\n");
      out.write("                    <p style=\"padding-left: 300px\">                       </p>\n");
      out.write("                    ");
}else{
      out.write("\n");
      out.write("                    <p>Alumnos de la especialidad de ");
      out.print(esp.getNom_esp());
      out.write("</p>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    <ul>\n");
      out.write("                        ");
for(especialidad x:lista){
      out.write("\n");
      out.write("                        <li><a href=\"alumnos?id=");
      out.print(x.getCod_esp());
      out.write('"');
      out.write('>');
      out.print(x.getNom_esp());
      out.write("</a></li>\n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    ");
if(alumnos == null && alumnosIndice == null){
      out.write("\n");
      out.write("                    <p>                       </p>\n");
      out.write("                    ");
}else if(alumnos == null){
      out.write("\n");
      out.write("                    <table class=\"tabla\">\n");
      out.write("                        ");
for(alumno z:alumnosIndice){
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print(z.getNom_alum());
      out.write("</td>\n");
      out.write("                            <td> <a href=\"foto?idAlumno=");
      out.print(z.getCod_al());
      out.write("\">Ver</a></td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                    </table>\n");
      out.write("                    ");
}else{
      out.write("\n");
      out.write("                        <table class=\"tabla\">\n");
      out.write("                        ");
for(alumno y:alumnos){
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print(y.getNom_alum());
      out.write("</td>\n");
      out.write("                            <td> <a href=\"foto?idAlumno=");
      out.print(y.getCod_al());
      out.write("\">Ver</a></td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                    </table>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
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
